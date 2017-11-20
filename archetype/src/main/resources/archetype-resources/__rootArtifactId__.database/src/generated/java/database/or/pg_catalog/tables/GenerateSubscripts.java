/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables;


import ${package}.database.or.pg_catalog.PgCatalog;
import ${package}.database.or.pg_catalog.tables.records.GenerateSubscriptsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GenerateSubscripts extends TableImpl<GenerateSubscriptsRecord> {

    private static final long serialVersionUID = 686749080;

    /**
     * The reference instance of <code>pg_catalog.generate_subscripts</code>
     */
    public static final GenerateSubscripts GENERATE_SUBSCRIPTS = new GenerateSubscripts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GenerateSubscriptsRecord> getRecordType() {
        return GenerateSubscriptsRecord.class;
    }

    /**
     * The column <code>pg_catalog.generate_subscripts.generate_subscripts</code>.
     */
    public final TableField<GenerateSubscriptsRecord, Integer> GENERATE_SUBSCRIPTS_ = createField("generate_subscripts", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>pg_catalog.generate_subscripts</code> table reference
     */
    public GenerateSubscripts() {
        this(DSL.name("generate_subscripts"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.generate_subscripts</code> table reference
     */
    public GenerateSubscripts(String alias) {
        this(DSL.name(alias), GENERATE_SUBSCRIPTS);
    }

    /**
     * Create an aliased <code>pg_catalog.generate_subscripts</code> table reference
     */
    public GenerateSubscripts(Name alias) {
        this(alias, GENERATE_SUBSCRIPTS);
    }

    private GenerateSubscripts(Name alias, Table<GenerateSubscriptsRecord> aliased) {
        this(alias, aliased, new Field[2]);
    }

    private GenerateSubscripts(Name alias, Table<GenerateSubscriptsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenerateSubscripts as(String alias) {
        return new GenerateSubscripts(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GenerateSubscripts as(Name alias) {
        return new GenerateSubscripts(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GenerateSubscripts rename(String name) {
        return new GenerateSubscripts(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GenerateSubscripts rename(Name name) {
        return new GenerateSubscripts(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public GenerateSubscripts call(Object __1, Integer __2) {
        return new GenerateSubscripts(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.DefaultDataType.getDefaultDataType("anyarray"))
            , DSL.val(__2, org.jooq.impl.SQLDataType.INTEGER)
        });
    }

    /**
     * Call this table-valued function
     */
    public GenerateSubscripts call(Field<Object> __1, Field<Integer> __2) {
        return new GenerateSubscripts(DSL.name(getName()), null, new Field[] { 
              __1
            , __2
        });
    }
}
