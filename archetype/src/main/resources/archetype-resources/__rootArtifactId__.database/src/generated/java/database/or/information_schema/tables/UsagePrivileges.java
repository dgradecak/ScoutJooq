/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.information_schema.tables;


import ${package}.database.or.information_schema.InformationSchema;
import ${package}.database.or.information_schema.tables.records.UsagePrivilegesRecord;

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
public class UsagePrivileges extends TableImpl<UsagePrivilegesRecord> {

    private static final long serialVersionUID = -2068584405;

    /**
     * The reference instance of <code>information_schema.usage_privileges</code>
     */
    public static final UsagePrivileges USAGE_PRIVILEGES = new UsagePrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsagePrivilegesRecord> getRecordType() {
        return UsagePrivilegesRecord.class;
    }

    /**
     * The column <code>information_schema.usage_privileges.grantor</code>.
     */
    public final TableField<UsagePrivilegesRecord, String> GRANTOR = createField("grantor", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.usage_privileges.grantee</code>.
     */
    public final TableField<UsagePrivilegesRecord, String> GRANTEE = createField("grantee", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.usage_privileges.object_catalog</code>.
     */
    public final TableField<UsagePrivilegesRecord, String> OBJECT_CATALOG = createField("object_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.usage_privileges.object_schema</code>.
     */
    public final TableField<UsagePrivilegesRecord, String> OBJECT_SCHEMA = createField("object_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.usage_privileges.object_name</code>.
     */
    public final TableField<UsagePrivilegesRecord, String> OBJECT_NAME = createField("object_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.usage_privileges.object_type</code>.
     */
    public final TableField<UsagePrivilegesRecord, String> OBJECT_TYPE = createField("object_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.usage_privileges.privilege_type</code>.
     */
    public final TableField<UsagePrivilegesRecord, String> PRIVILEGE_TYPE = createField("privilege_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.usage_privileges.is_grantable</code>.
     */
    public final TableField<UsagePrivilegesRecord, String> IS_GRANTABLE = createField("is_grantable", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * Create a <code>information_schema.usage_privileges</code> table reference
     */
    public UsagePrivileges() {
        this(DSL.name("usage_privileges"), null);
    }

    /**
     * Create an aliased <code>information_schema.usage_privileges</code> table reference
     */
    public UsagePrivileges(String alias) {
        this(DSL.name(alias), USAGE_PRIVILEGES);
    }

    /**
     * Create an aliased <code>information_schema.usage_privileges</code> table reference
     */
    public UsagePrivileges(Name alias) {
        this(alias, USAGE_PRIVILEGES);
    }

    private UsagePrivileges(Name alias, Table<UsagePrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UsagePrivileges(Name alias, Table<UsagePrivilegesRecord> aliased, Field<?>[] parameters) {
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
    public UsagePrivileges as(String alias) {
        return new UsagePrivileges(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsagePrivileges as(Name alias) {
        return new UsagePrivileges(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UsagePrivileges rename(String name) {
        return new UsagePrivileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UsagePrivileges rename(Name name) {
        return new UsagePrivileges(name, null);
    }
}