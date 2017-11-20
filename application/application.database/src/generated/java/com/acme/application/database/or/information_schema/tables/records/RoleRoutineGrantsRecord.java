/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.information_schema.tables.records;


import com.acme.application.database.or.information_schema.tables.RoleRoutineGrants;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class RoleRoutineGrantsRecord extends TableRecordImpl<RoleRoutineGrantsRecord> implements Record10<String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 404303622;

    /**
     * Setter for <code>information_schema.role_routine_grants.grantor</code>.
     */
    public void setGrantor(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.role_routine_grants.grantor</code>.
     */
    public String getGrantor() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.role_routine_grants.grantee</code>.
     */
    public void setGrantee(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.role_routine_grants.grantee</code>.
     */
    public String getGrantee() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.role_routine_grants.specific_catalog</code>.
     */
    public void setSpecificCatalog(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.role_routine_grants.specific_catalog</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.role_routine_grants.specific_schema</code>.
     */
    public void setSpecificSchema(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.role_routine_grants.specific_schema</code>.
     */
    public String getSpecificSchema() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.role_routine_grants.specific_name</code>.
     */
    public void setSpecificName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.role_routine_grants.specific_name</code>.
     */
    public String getSpecificName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.role_routine_grants.routine_catalog</code>.
     */
    public void setRoutineCatalog(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.role_routine_grants.routine_catalog</code>.
     */
    public String getRoutineCatalog() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.role_routine_grants.routine_schema</code>.
     */
    public void setRoutineSchema(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.role_routine_grants.routine_schema</code>.
     */
    public String getRoutineSchema() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.role_routine_grants.routine_name</code>.
     */
    public void setRoutineName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.role_routine_grants.routine_name</code>.
     */
    public String getRoutineName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.role_routine_grants.privilege_type</code>.
     */
    public void setPrivilegeType(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.role_routine_grants.privilege_type</code>.
     */
    public String getPrivilegeType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.role_routine_grants.is_grantable</code>.
     */
    public void setIsGrantable(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.role_routine_grants.is_grantable</code>.
     */
    public String getIsGrantable() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.GRANTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.GRANTEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.SPECIFIC_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.SPECIFIC_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.SPECIFIC_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.ROUTINE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.ROUTINE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.ROUTINE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.PRIVILEGE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return RoleRoutineGrants.ROLE_ROUTINE_GRANTS.IS_GRANTABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getGrantor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSpecificCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSpecificSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSpecificName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRoutineCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getRoutineSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRoutineName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getPrivilegeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGrantor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSpecificCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSpecificSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSpecificName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRoutineCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getRoutineSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRoutineName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPrivilegeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoutineGrantsRecord value1(String value) {
        setGrantor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoutineGrantsRecord value2(String value) {
        setGrantee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoutineGrantsRecord value3(String value) {
        setSpecificCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoutineGrantsRecord value4(String value) {
        setSpecificSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoutineGrantsRecord value5(String value) {
        setSpecificName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoutineGrantsRecord value6(String value) {
        setRoutineCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoutineGrantsRecord value7(String value) {
        setRoutineSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoutineGrantsRecord value8(String value) {
        setRoutineName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoutineGrantsRecord value9(String value) {
        setPrivilegeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoutineGrantsRecord value10(String value) {
        setIsGrantable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRoutineGrantsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleRoutineGrantsRecord
     */
    public RoleRoutineGrantsRecord() {
        super(RoleRoutineGrants.ROLE_ROUTINE_GRANTS);
    }

    /**
     * Create a detached, initialised RoleRoutineGrantsRecord
     */
    public RoleRoutineGrantsRecord(String grantor, String grantee, String specificCatalog, String specificSchema, String specificName, String routineCatalog, String routineSchema, String routineName, String privilegeType, String isGrantable) {
        super(RoleRoutineGrants.ROLE_ROUTINE_GRANTS);

        set(0, grantor);
        set(1, grantee);
        set(2, specificCatalog);
        set(3, specificSchema);
        set(4, specificName);
        set(5, routineCatalog);
        set(6, routineSchema);
        set(7, routineName);
        set(8, privilegeType);
        set(9, isGrantable);
    }
}
