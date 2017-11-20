/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.information_schema.tables.records;


import ${package}.database.or.information_schema.tables.ApplicableRoles;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class ApplicableRolesRecord extends TableRecordImpl<ApplicableRolesRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -2465553;

    /**
     * Setter for <code>information_schema.applicable_roles.grantee</code>.
     */
    public void setGrantee(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.applicable_roles.grantee</code>.
     */
    public String getGrantee() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.applicable_roles.role_name</code>.
     */
    public void setRoleName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.applicable_roles.role_name</code>.
     */
    public String getRoleName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.applicable_roles.is_grantable</code>.
     */
    public void setIsGrantable(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.applicable_roles.is_grantable</code>.
     */
    public String getIsGrantable() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ApplicableRoles.APPLICABLE_ROLES.GRANTEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ApplicableRoles.APPLICABLE_ROLES.ROLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ApplicableRoles.APPLICABLE_ROLES.IS_GRANTABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRoleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRoleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicableRolesRecord value1(String value) {
        setGrantee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicableRolesRecord value2(String value) {
        setRoleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicableRolesRecord value3(String value) {
        setIsGrantable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicableRolesRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApplicableRolesRecord
     */
    public ApplicableRolesRecord() {
        super(ApplicableRoles.APPLICABLE_ROLES);
    }

    /**
     * Create a detached, initialised ApplicableRolesRecord
     */
    public ApplicableRolesRecord(String grantee, String roleName, String isGrantable) {
        super(ApplicableRoles.APPLICABLE_ROLES);

        set(0, grantee);
        set(1, roleName);
        set(2, isGrantable);
    }
}