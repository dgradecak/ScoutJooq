/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables;


import ${package}.database.or.pg_catalog.Indexes;
import ${package}.database.or.pg_catalog.PgCatalog;
import ${package}.database.or.pg_catalog.tables.records.PgTsParserRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
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
public class PgTsParser extends TableImpl<PgTsParserRecord> {

    private static final long serialVersionUID = -2103344926;

    /**
     * The reference instance of <code>pg_catalog.pg_ts_parser</code>
     */
    public static final PgTsParser PG_TS_PARSER = new PgTsParser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTsParserRecord> getRecordType() {
        return PgTsParserRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsname</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSNAME = createField("prsname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsnamespace</code>.
     */
    public final TableField<PgTsParserRecord, Long> PRSNAMESPACE = createField("prsnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsstart</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSSTART = createField("prsstart", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prstoken</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSTOKEN = createField("prstoken", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsend</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSEND = createField("prsend", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prsheadline</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSHEADLINE = createField("prsheadline", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_parser.prslextype</code>.
     */
    public final TableField<PgTsParserRecord, String> PRSLEXTYPE = createField("prslextype", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_ts_parser</code> table reference
     */
    public PgTsParser() {
        this(DSL.name("pg_ts_parser"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_parser</code> table reference
     */
    public PgTsParser(String alias) {
        this(DSL.name(alias), PG_TS_PARSER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_parser</code> table reference
     */
    public PgTsParser(Name alias) {
        this(alias, PG_TS_PARSER);
    }

    private PgTsParser(Name alias, Table<PgTsParserRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTsParser(Name alias, Table<PgTsParserRecord> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_TS_PARSER_PRSNAME_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsParser as(String alias) {
        return new PgTsParser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsParser as(Name alias) {
        return new PgTsParser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsParser rename(String name) {
        return new PgTsParser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsParser rename(Name name) {
        return new PgTsParser(name, null);
    }
}
