/*
 * This file is generated by jOOQ.
*/
package ch.uzh.sprachenzentrum.kursadmin.database.or.sys.tables.records;


import ch.uzh.sprachenzentrum.kursadmin.database.or.sys.tables.Sysconglomerates;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class SysconglomeratesRecord extends TableRecordImpl<SysconglomeratesRecord> implements Record8<String, String, BigDecimal, String, Boolean, String, Boolean, String> {

    private static final long serialVersionUID = 1923291510;

    /**
     * Setter for <code>SYS.SYSCONGLOMERATES.SCHEMAID</code>.
     */
    public void setSchemaid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>SYS.SYSCONGLOMERATES.SCHEMAID</code>.
     */
    public String getSchemaid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>SYS.SYSCONGLOMERATES.TABLEID</code>.
     */
    public void setTableid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>SYS.SYSCONGLOMERATES.TABLEID</code>.
     */
    public String getTableid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>SYS.SYSCONGLOMERATES.CONGLOMERATENUMBER</code>.
     */
    public void setConglomeratenumber(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>SYS.SYSCONGLOMERATES.CONGLOMERATENUMBER</code>.
     */
    public BigDecimal getConglomeratenumber() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>SYS.SYSCONGLOMERATES.CONGLOMERATENAME</code>.
     */
    public void setConglomeratename(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SYS.SYSCONGLOMERATES.CONGLOMERATENAME</code>.
     */
    public String getConglomeratename() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SYS.SYSCONGLOMERATES.ISINDEX</code>.
     */
    public void setIsindex(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>SYS.SYSCONGLOMERATES.ISINDEX</code>.
     */
    public Boolean getIsindex() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>SYS.SYSCONGLOMERATES.DESCRIPTOR</code>.
     */
    public void setDescriptor(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SYS.SYSCONGLOMERATES.DESCRIPTOR</code>.
     */
    public String getDescriptor() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SYS.SYSCONGLOMERATES.ISCONSTRAINT</code>.
     */
    public void setIsconstraint(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>SYS.SYSCONGLOMERATES.ISCONSTRAINT</code>.
     */
    public Boolean getIsconstraint() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>SYS.SYSCONGLOMERATES.CONGLOMERATEID</code>.
     */
    public void setConglomerateid(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SYS.SYSCONGLOMERATES.CONGLOMERATEID</code>.
     */
    public String getConglomerateid() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, BigDecimal, String, Boolean, String, Boolean, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, BigDecimal, String, Boolean, String, Boolean, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Sysconglomerates.SYSCONGLOMERATES.SCHEMAID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Sysconglomerates.SYSCONGLOMERATES.TABLEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return Sysconglomerates.SYSCONGLOMERATES.CONGLOMERATENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Sysconglomerates.SYSCONGLOMERATES.CONGLOMERATENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return Sysconglomerates.SYSCONGLOMERATES.ISINDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Sysconglomerates.SYSCONGLOMERATES.DESCRIPTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return Sysconglomerates.SYSCONGLOMERATES.ISCONSTRAINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Sysconglomerates.SYSCONGLOMERATES.CONGLOMERATEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSchemaid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTableid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getConglomeratenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getConglomeratename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getIsindex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDescriptor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getIsconstraint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getConglomerateid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSchemaid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTableid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getConglomeratenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getConglomeratename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getIsindex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescriptor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getIsconstraint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getConglomerateid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysconglomeratesRecord value1(String value) {
        setSchemaid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysconglomeratesRecord value2(String value) {
        setTableid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysconglomeratesRecord value3(BigDecimal value) {
        setConglomeratenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysconglomeratesRecord value4(String value) {
        setConglomeratename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysconglomeratesRecord value5(Boolean value) {
        setIsindex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysconglomeratesRecord value6(String value) {
        setDescriptor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysconglomeratesRecord value7(Boolean value) {
        setIsconstraint(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysconglomeratesRecord value8(String value) {
        setConglomerateid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysconglomeratesRecord values(String value1, String value2, BigDecimal value3, String value4, Boolean value5, String value6, Boolean value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysconglomeratesRecord
     */
    public SysconglomeratesRecord() {
        super(Sysconglomerates.SYSCONGLOMERATES);
    }

    /**
     * Create a detached, initialised SysconglomeratesRecord
     */
    public SysconglomeratesRecord(String schemaid, String tableid, BigDecimal conglomeratenumber, String conglomeratename, Boolean isindex, String descriptor, Boolean isconstraint, String conglomerateid) {
        super(Sysconglomerates.SYSCONGLOMERATES);

        set(0, schemaid);
        set(1, tableid);
        set(2, conglomeratenumber);
        set(3, conglomeratename);
        set(4, isindex);
        set(5, descriptor);
        set(6, isconstraint);
        set(7, conglomerateid);
    }
}
