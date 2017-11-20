/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables.records;


import com.acme.application.database.or.pg_catalog.tables.PgUser;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class PgUserRecord extends TableRecordImpl<PgUserRecord> implements Record9<String, Long, Boolean, Boolean, Boolean, Boolean, String, Object, String[]> {

    private static final long serialVersionUID = -877491187;

    /**
     * Setter for <code>pg_catalog.pg_user.usename</code>.
     */
    public void setUsename(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usename</code>.
     */
    public String getUsename() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.usesysid</code>.
     */
    public void setUsesysid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usesysid</code>.
     */
    public Long getUsesysid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.usecreatedb</code>.
     */
    public void setUsecreatedb(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usecreatedb</code>.
     */
    public Boolean getUsecreatedb() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.usesuper</code>.
     */
    public void setUsesuper(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usesuper</code>.
     */
    public Boolean getUsesuper() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.userepl</code>.
     */
    public void setUserepl(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.userepl</code>.
     */
    public Boolean getUserepl() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.usebypassrls</code>.
     */
    public void setUsebypassrls(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usebypassrls</code>.
     */
    public Boolean getUsebypassrls() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.passwd</code>.
     */
    public void setPasswd(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.passwd</code>.
     */
    public String getPasswd() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.valuntil</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setValuntil(Object value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.valuntil</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getValuntil() {
        return (Object) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.useconfig</code>.
     */
    public void setUseconfig(String... value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.useconfig</code>.
     */
    public String[] getUseconfig() {
        return (String[]) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, Long, Boolean, Boolean, Boolean, Boolean, String, Object, String[]> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, Long, Boolean, Boolean, Boolean, Boolean, String, Object, String[]> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgUser.PG_USER.USENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgUser.PG_USER.USESYSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return PgUser.PG_USER.USECREATEDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return PgUser.PG_USER.USESUPER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return PgUser.PG_USER.USEREPL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return PgUser.PG_USER.USEBYPASSRLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return PgUser.PG_USER.PASSWD;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field8() {
        return PgUser.PG_USER.VALUNTIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field9() {
        return PgUser.PG_USER.USECONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUsename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getUsesysid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getUsecreatedb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getUsesuper();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getUserepl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getUsebypassrls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPasswd();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component8() {
        return getValuntil();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component9() {
        return getUseconfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUsename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getUsesysid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getUsecreatedb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getUsesuper();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getUserepl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getUsebypassrls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPasswd();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value8() {
        return getValuntil();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value9() {
        return getUseconfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserRecord value1(String value) {
        setUsename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserRecord value2(Long value) {
        setUsesysid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserRecord value3(Boolean value) {
        setUsecreatedb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserRecord value4(Boolean value) {
        setUsesuper(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserRecord value5(Boolean value) {
        setUserepl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserRecord value6(Boolean value) {
        setUsebypassrls(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserRecord value7(String value) {
        setPasswd(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public PgUserRecord value8(Object value) {
        setValuntil(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserRecord value9(String... value) {
        setUseconfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserRecord values(String value1, Long value2, Boolean value3, Boolean value4, Boolean value5, Boolean value6, String value7, Object value8, String[] value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgUserRecord
     */
    public PgUserRecord() {
        super(PgUser.PG_USER);
    }

    /**
     * Create a detached, initialised PgUserRecord
     */
    public PgUserRecord(String usename, Long usesysid, Boolean usecreatedb, Boolean usesuper, Boolean userepl, Boolean usebypassrls, String passwd, Object valuntil, String[] useconfig) {
        super(PgUser.PG_USER);

        set(0, usename);
        set(1, usesysid);
        set(2, usecreatedb);
        set(3, usesuper);
        set(4, userepl);
        set(5, usebypassrls);
        set(6, passwd);
        set(7, valuntil);
        set(8, useconfig);
    }
}
