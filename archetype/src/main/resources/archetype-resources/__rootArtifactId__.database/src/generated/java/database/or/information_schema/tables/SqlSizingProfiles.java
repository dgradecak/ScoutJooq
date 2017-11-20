/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.information_schema.tables;


import ${package}.database.or.information_schema.InformationSchema;
import ${package}.database.or.information_schema.tables.records.SqlSizingProfilesRecord;

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
public class SqlSizingProfiles extends TableImpl<SqlSizingProfilesRecord> {

    private static final long serialVersionUID = 1777899308;

    /**
     * The reference instance of <code>information_schema.sql_sizing_profiles</code>
     */
    public static final SqlSizingProfiles SQL_SIZING_PROFILES = new SqlSizingProfiles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SqlSizingProfilesRecord> getRecordType() {
        return SqlSizingProfilesRecord.class;
    }

    /**
     * The column <code>information_schema.sql_sizing_profiles.sizing_id</code>.
     */
    public final TableField<SqlSizingProfilesRecord, Integer> SIZING_ID = createField("sizing_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.sql_sizing_profiles.sizing_name</code>.
     */
    public final TableField<SqlSizingProfilesRecord, String> SIZING_NAME = createField("sizing_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_sizing_profiles.profile_id</code>.
     */
    public final TableField<SqlSizingProfilesRecord, String> PROFILE_ID = createField("profile_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_sizing_profiles.required_value</code>.
     */
    public final TableField<SqlSizingProfilesRecord, Integer> REQUIRED_VALUE = createField("required_value", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.sql_sizing_profiles.comments</code>.
     */
    public final TableField<SqlSizingProfilesRecord, String> COMMENTS = createField("comments", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.sql_sizing_profiles</code> table reference
     */
    public SqlSizingProfiles() {
        this(DSL.name("sql_sizing_profiles"), null);
    }

    /**
     * Create an aliased <code>information_schema.sql_sizing_profiles</code> table reference
     */
    public SqlSizingProfiles(String alias) {
        this(DSL.name(alias), SQL_SIZING_PROFILES);
    }

    /**
     * Create an aliased <code>information_schema.sql_sizing_profiles</code> table reference
     */
    public SqlSizingProfiles(Name alias) {
        this(alias, SQL_SIZING_PROFILES);
    }

    private SqlSizingProfiles(Name alias, Table<SqlSizingProfilesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SqlSizingProfiles(Name alias, Table<SqlSizingProfilesRecord> aliased, Field<?>[] parameters) {
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
    public SqlSizingProfiles as(String alias) {
        return new SqlSizingProfiles(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSizingProfiles as(Name alias) {
        return new SqlSizingProfiles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlSizingProfiles rename(String name) {
        return new SqlSizingProfiles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlSizingProfiles rename(Name name) {
        return new SqlSizingProfiles(name, null);
    }
}
