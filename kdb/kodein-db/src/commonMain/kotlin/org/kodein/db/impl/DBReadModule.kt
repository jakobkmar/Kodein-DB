package org.kodein.db.impl

import org.kodein.db.*
import org.kodein.db.model.ModelRead
import kotlin.reflect.KClass

internal interface DBReadModule : DBRead {

    val mdb: ModelRead

    @Suppress("ReplaceGetOrSet")
    override fun <M : Any> get(type: KClass<M>, key: Key<M>, vararg options: Options.Get): M? = mdb.get(type, key, *options)?.model

    override fun findAll(vararg options: Options.Find): Cursor<*> = CursorImpl(mdb.findAll(*options))

    override fun <M : Any> find(type: KClass<M>, vararg options: Options.Find): DBRead.FindDsl<M> = FindDslImpl(mdb, type, options)

    override fun getIndexesOf(key: Key<*>): Set<String> = mdb.getIndexesOf(key)

    class FindDslImpl<M : Any>(private val mdb: ModelRead, private val type: KClass<M>, private val options: Array<out Options.Find>) : DBRead.FindDsl<M> {

        override fun byId(vararg id: Any, isOpen: Boolean): Cursor<M> =
            CursorImpl(if (id.isEmpty()) mdb.findAllByType(type, *options) else mdb.findById(type, id, isOpen, *options))

        override fun byIndex(index: String, vararg value: Any, isOpen: Boolean): Cursor<M> =
                CursorImpl(if (value.isEmpty()) mdb.findAllByIndex(type, index, *options) else mdb.findByIndex(type, index, value, isOpen, *options))

    }

}
