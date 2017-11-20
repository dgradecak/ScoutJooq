/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.information_schema.tables;


import ${package}.database.or.information_schema.InformationSchema;
import ${package}.database.or.information_schema.tables.records.UdtPrivilegesRecord;

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
public class UdtPrivileges extends TableImpl<UdtPrivilegesRecord> {

    private static final long serialVersionUID = 521699756;

    /**
     * The reference instance of <code>information_schema.udt_privileges</code>
     */
    public static final UdtPrivileges UDT_PRIVILEGES = new UdtPrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UdtPrivilegesRecord> getRecordType() {
        return UdtPrivilegesRecord.class;
    }

    /**
     * The column <code>information_schema.udt_privileges.grantor</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> GRANTOR = createField("grantor", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.udt_privileges.grantee</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> GRANTEE = createField("grantee", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_catalog</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> UDT_CATALOG = createField("udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_schema</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> UDT_SCHEMA = createField("udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_name</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> UDT_NAME = createField("udt_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.udt_privileges.privilege_type</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> PRIVILEGE_TYPE = createField("privilege_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.udt_privileges.is_grantable</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> IS_GRANTABLE = createField("is_grantable", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * Create a <code>information_schema.udt_privileges</code> table reference
     */
    public UdtPrivileges() {
        this(DSL.name("udt_privileges"), null);
    }

    /**
     * Create an aliased <code>information_schema.udt_privileges</code> table reference
     */
    public UdtPrivileges(String alias) {
        this(DSL.name(alias), UDT_PRIVILEGES);
    }

    /**
     * Create an aliased <code>information_schema.udt_privileges</code> table reference
     */
    public UdtPrivileges(Name alias) {
        this(alias, UDT_PRIVILEGES);
    }

    private UdtPrivileges(Name alias, Table<UdtPrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UdtPrivileges(Name alias, Table<UdtPrivilegesRecord> aliased, Field<?>[] parameters) {
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
    public UdtPrivileges as(String alias) {
        return new UdtPrivileges(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UdtPrivileges as(Name alias) {
        return new UdtPrivileges(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UdtPrivileges rename(String name) {
        return new UdtPrivileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UdtPrivileges rename(Name name) {
        return new UdtPrivileges(name, null);
    }
}
