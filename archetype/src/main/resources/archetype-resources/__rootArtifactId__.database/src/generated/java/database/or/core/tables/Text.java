/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.core.tables;


import ${package}.database.or.core.Core;
import ${package}.database.or.core.Keys;
import ${package}.database.or.core.tables.records.TextRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class Text extends TableImpl<TextRecord> {

    private static final long serialVersionUID = -193257184;

    /**
     * The reference instance of <code>core.TEXT</code>
     */
    public static final Text TEXT = new Text();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TextRecord> getRecordType() {
        return TextRecord.class;
    }

    /**
     * The column <code>core.TEXT.KEY</code>.
     */
    public final TableField<TextRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>core.TEXT.LOCALE</code>.
     */
    public final TableField<TextRecord, String> LOCALE = createField("LOCALE", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>core.TEXT.TEXT</code>.
     */
    public final TableField<TextRecord, String> TEXT_ = createField("TEXT", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * Create a <code>core.TEXT</code> table reference
     */
    public Text() {
        this(DSL.name("TEXT"), null);
    }

    /**
     * Create an aliased <code>core.TEXT</code> table reference
     */
    public Text(String alias) {
        this(DSL.name(alias), TEXT);
    }

    /**
     * Create an aliased <code>core.TEXT</code> table reference
     */
    public Text(Name alias) {
        this(alias, TEXT);
    }

    private Text(Name alias, Table<TextRecord> aliased) {
        this(alias, aliased, null);
    }

    private Text(Name alias, Table<TextRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Core.CORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TextRecord> getPrimaryKey() {
        return Keys.PK_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TextRecord>> getKeys() {
        return Arrays.<UniqueKey<TextRecord>>asList(Keys.PK_TEXT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Text as(String alias) {
        return new Text(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Text as(Name alias) {
        return new Text(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Text rename(String name) {
        return new Text(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Text rename(Name name) {
        return new Text(name, null);
    }
}
