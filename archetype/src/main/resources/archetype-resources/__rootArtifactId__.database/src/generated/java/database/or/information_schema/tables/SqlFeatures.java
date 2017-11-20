/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.information_schema.tables;


import ${package}.database.or.information_schema.InformationSchema;
import ${package}.database.or.information_schema.tables.records.SqlFeaturesRecord;

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
public class SqlFeatures extends TableImpl<SqlFeaturesRecord> {

    private static final long serialVersionUID = 1082691115;

    /**
     * The reference instance of <code>information_schema.sql_features</code>
     */
    public static final SqlFeatures SQL_FEATURES = new SqlFeatures();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SqlFeaturesRecord> getRecordType() {
        return SqlFeaturesRecord.class;
    }

    /**
     * The column <code>information_schema.sql_features.feature_id</code>.
     */
    public final TableField<SqlFeaturesRecord, String> FEATURE_ID = createField("feature_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_features.feature_name</code>.
     */
    public final TableField<SqlFeaturesRecord, String> FEATURE_NAME = createField("feature_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_features.sub_feature_id</code>.
     */
    public final TableField<SqlFeaturesRecord, String> SUB_FEATURE_ID = createField("sub_feature_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_features.sub_feature_name</code>.
     */
    public final TableField<SqlFeaturesRecord, String> SUB_FEATURE_NAME = createField("sub_feature_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_features.is_supported</code>.
     */
    public final TableField<SqlFeaturesRecord, String> IS_SUPPORTED = createField("is_supported", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.sql_features.is_verified_by</code>.
     */
    public final TableField<SqlFeaturesRecord, String> IS_VERIFIED_BY = createField("is_verified_by", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.sql_features.comments</code>.
     */
    public final TableField<SqlFeaturesRecord, String> COMMENTS = createField("comments", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.sql_features</code> table reference
     */
    public SqlFeatures() {
        this(DSL.name("sql_features"), null);
    }

    /**
     * Create an aliased <code>information_schema.sql_features</code> table reference
     */
    public SqlFeatures(String alias) {
        this(DSL.name(alias), SQL_FEATURES);
    }

    /**
     * Create an aliased <code>information_schema.sql_features</code> table reference
     */
    public SqlFeatures(Name alias) {
        this(alias, SQL_FEATURES);
    }

    private SqlFeatures(Name alias, Table<SqlFeaturesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SqlFeatures(Name alias, Table<SqlFeaturesRecord> aliased, Field<?>[] parameters) {
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
    public SqlFeatures as(String alias) {
        return new SqlFeatures(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlFeatures as(Name alias) {
        return new SqlFeatures(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlFeatures rename(String name) {
        return new SqlFeatures(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlFeatures rename(Name name) {
        return new SqlFeatures(name, null);
    }
}
