/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.information_schema.tables;


import com.acme.application.database.or.information_schema.InformationSchema;
import com.acme.application.database.or.information_schema.tables.records.DomainsRecord;

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
public class Domains extends TableImpl<DomainsRecord> {

    private static final long serialVersionUID = -1892283632;

    /**
     * The reference instance of <code>information_schema.domains</code>
     */
    public static final Domains DOMAINS = new Domains();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DomainsRecord> getRecordType() {
        return DomainsRecord.class;
    }

    /**
     * The column <code>information_schema.domains.domain_catalog</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_CATALOG = createField("domain_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.domain_schema</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_SCHEMA = createField("domain_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.domain_name</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_NAME = createField("domain_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.data_type</code>.
     */
    public final TableField<DomainsRecord, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.character_maximum_length</code>.
     */
    public final TableField<DomainsRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField("character_maximum_length", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.domains.character_octet_length</code>.
     */
    public final TableField<DomainsRecord, Integer> CHARACTER_OCTET_LENGTH = createField("character_octet_length", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.domains.character_set_catalog</code>.
     */
    public final TableField<DomainsRecord, String> CHARACTER_SET_CATALOG = createField("character_set_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.character_set_schema</code>.
     */
    public final TableField<DomainsRecord, String> CHARACTER_SET_SCHEMA = createField("character_set_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.character_set_name</code>.
     */
    public final TableField<DomainsRecord, String> CHARACTER_SET_NAME = createField("character_set_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.collation_catalog</code>.
     */
    public final TableField<DomainsRecord, String> COLLATION_CATALOG = createField("collation_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.collation_schema</code>.
     */
    public final TableField<DomainsRecord, String> COLLATION_SCHEMA = createField("collation_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.collation_name</code>.
     */
    public final TableField<DomainsRecord, String> COLLATION_NAME = createField("collation_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.numeric_precision</code>.
     */
    public final TableField<DomainsRecord, Integer> NUMERIC_PRECISION = createField("numeric_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.domains.numeric_precision_radix</code>.
     */
    public final TableField<DomainsRecord, Integer> NUMERIC_PRECISION_RADIX = createField("numeric_precision_radix", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.domains.numeric_scale</code>.
     */
    public final TableField<DomainsRecord, Integer> NUMERIC_SCALE = createField("numeric_scale", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.domains.datetime_precision</code>.
     */
    public final TableField<DomainsRecord, Integer> DATETIME_PRECISION = createField("datetime_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.domains.interval_type</code>.
     */
    public final TableField<DomainsRecord, String> INTERVAL_TYPE = createField("interval_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.interval_precision</code>.
     */
    public final TableField<DomainsRecord, Integer> INTERVAL_PRECISION = createField("interval_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.domains.domain_default</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_DEFAULT = createField("domain_default", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.udt_catalog</code>.
     */
    public final TableField<DomainsRecord, String> UDT_CATALOG = createField("udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.udt_schema</code>.
     */
    public final TableField<DomainsRecord, String> UDT_SCHEMA = createField("udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.udt_name</code>.
     */
    public final TableField<DomainsRecord, String> UDT_NAME = createField("udt_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.scope_catalog</code>.
     */
    public final TableField<DomainsRecord, String> SCOPE_CATALOG = createField("scope_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.scope_schema</code>.
     */
    public final TableField<DomainsRecord, String> SCOPE_SCHEMA = createField("scope_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.scope_name</code>.
     */
    public final TableField<DomainsRecord, String> SCOPE_NAME = createField("scope_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.maximum_cardinality</code>.
     */
    public final TableField<DomainsRecord, Integer> MAXIMUM_CARDINALITY = createField("maximum_cardinality", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.domains.dtd_identifier</code>.
     */
    public final TableField<DomainsRecord, String> DTD_IDENTIFIER = createField("dtd_identifier", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.domains</code> table reference
     */
    public Domains() {
        this(DSL.name("domains"), null);
    }

    /**
     * Create an aliased <code>information_schema.domains</code> table reference
     */
    public Domains(String alias) {
        this(DSL.name(alias), DOMAINS);
    }

    /**
     * Create an aliased <code>information_schema.domains</code> table reference
     */
    public Domains(Name alias) {
        this(alias, DOMAINS);
    }

    private Domains(Name alias, Table<DomainsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Domains(Name alias, Table<DomainsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Domains as(String alias) {
        return new Domains(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Domains as(Name alias) {
        return new Domains(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Domains rename(String name) {
        return new Domains(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Domains rename(Name name) {
        return new Domains(name, null);
    }
}
