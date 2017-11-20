/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables.records;


import ${package}.database.or.pg_catalog.tables.PgAttribute;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record22;
import org.jooq.Row22;
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
public class PgAttributeRecord extends TableRecordImpl<PgAttributeRecord> implements Record22<Long, String, Long, Integer, Short, Short, Integer, Integer, Integer, Boolean, String, String, Boolean, Boolean, String, Boolean, Boolean, Integer, Long, String[], String[], String[]> {

    private static final long serialVersionUID = -954213489;

    /**
     * Setter for <code>pg_catalog.pg_attribute.attrelid</code>.
     */
    public void setAttrelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attrelid</code>.
     */
    public Long getAttrelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attname</code>.
     */
    public void setAttname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attname</code>.
     */
    public String getAttname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.atttypid</code>.
     */
    public void setAtttypid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.atttypid</code>.
     */
    public Long getAtttypid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attstattarget</code>.
     */
    public void setAttstattarget(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attstattarget</code>.
     */
    public Integer getAttstattarget() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attlen</code>.
     */
    public void setAttlen(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attlen</code>.
     */
    public Short getAttlen() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attnum</code>.
     */
    public void setAttnum(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attnum</code>.
     */
    public Short getAttnum() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attndims</code>.
     */
    public void setAttndims(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attndims</code>.
     */
    public Integer getAttndims() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attcacheoff</code>.
     */
    public void setAttcacheoff(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attcacheoff</code>.
     */
    public Integer getAttcacheoff() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.atttypmod</code>.
     */
    public void setAtttypmod(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.atttypmod</code>.
     */
    public Integer getAtttypmod() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attbyval</code>.
     */
    public void setAttbyval(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attbyval</code>.
     */
    public Boolean getAttbyval() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attstorage</code>.
     */
    public void setAttstorage(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attstorage</code>.
     */
    public String getAttstorage() {
        return (String) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attalign</code>.
     */
    public void setAttalign(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attalign</code>.
     */
    public String getAttalign() {
        return (String) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attnotnull</code>.
     */
    public void setAttnotnull(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attnotnull</code>.
     */
    public Boolean getAttnotnull() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.atthasdef</code>.
     */
    public void setAtthasdef(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.atthasdef</code>.
     */
    public Boolean getAtthasdef() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attidentity</code>.
     */
    public void setAttidentity(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attidentity</code>.
     */
    public String getAttidentity() {
        return (String) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attisdropped</code>.
     */
    public void setAttisdropped(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attisdropped</code>.
     */
    public Boolean getAttisdropped() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attislocal</code>.
     */
    public void setAttislocal(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attislocal</code>.
     */
    public Boolean getAttislocal() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attinhcount</code>.
     */
    public void setAttinhcount(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attinhcount</code>.
     */
    public Integer getAttinhcount() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attcollation</code>.
     */
    public void setAttcollation(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attcollation</code>.
     */
    public Long getAttcollation() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attacl</code>.
     */
    public void setAttacl(String... value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attacl</code>.
     */
    public String[] getAttacl() {
        return (String[]) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attoptions</code>.
     */
    public void setAttoptions(String... value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attoptions</code>.
     */
    public String[] getAttoptions() {
        return (String[]) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_attribute.attfdwoptions</code>.
     */
    public void setAttfdwoptions(String... value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_attribute.attfdwoptions</code>.
     */
    public String[] getAttfdwoptions() {
        return (String[]) get(21);
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Long, String, Long, Integer, Short, Short, Integer, Integer, Integer, Boolean, String, String, Boolean, Boolean, String, Boolean, Boolean, Integer, Long, String[], String[], String[]> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<Long, String, Long, Integer, Short, Short, Integer, Integer, Integer, Boolean, String, String, Boolean, Boolean, String, Boolean, Boolean, Integer, Long, String[], String[], String[]> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgAttribute.PG_ATTRIBUTE.ATTRELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgAttribute.PG_ATTRIBUTE.ATTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgAttribute.PG_ATTRIBUTE.ATTTYPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return PgAttribute.PG_ATTRIBUTE.ATTSTATTARGET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return PgAttribute.PG_ATTRIBUTE.ATTLEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return PgAttribute.PG_ATTRIBUTE.ATTNUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return PgAttribute.PG_ATTRIBUTE.ATTNDIMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return PgAttribute.PG_ATTRIBUTE.ATTCACHEOFF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return PgAttribute.PG_ATTRIBUTE.ATTTYPMOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return PgAttribute.PG_ATTRIBUTE.ATTBYVAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return PgAttribute.PG_ATTRIBUTE.ATTSTORAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return PgAttribute.PG_ATTRIBUTE.ATTALIGN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return PgAttribute.PG_ATTRIBUTE.ATTNOTNULL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return PgAttribute.PG_ATTRIBUTE.ATTHASDEF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return PgAttribute.PG_ATTRIBUTE.ATTIDENTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field16() {
        return PgAttribute.PG_ATTRIBUTE.ATTISDROPPED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field17() {
        return PgAttribute.PG_ATTRIBUTE.ATTISLOCAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return PgAttribute.PG_ATTRIBUTE.ATTINHCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field19() {
        return PgAttribute.PG_ATTRIBUTE.ATTCOLLATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field20() {
        return PgAttribute.PG_ATTRIBUTE.ATTACL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field21() {
        return PgAttribute.PG_ATTRIBUTE.ATTOPTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field22() {
        return PgAttribute.PG_ATTRIBUTE.ATTFDWOPTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getAttrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAttname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getAtttypid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getAttstattarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getAttlen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getAttnum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getAttndims();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getAttcacheoff();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getAtttypmod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getAttbyval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getAttstorage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getAttalign();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
        return getAttnotnull();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getAtthasdef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getAttidentity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component16() {
        return getAttisdropped();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component17() {
        return getAttislocal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component18() {
        return getAttinhcount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component19() {
        return getAttcollation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component20() {
        return getAttacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component21() {
        return getAttoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component22() {
        return getAttfdwoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getAttrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAttname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getAtttypid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAttstattarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getAttlen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getAttnum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getAttndims();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getAttcacheoff();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getAtttypmod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getAttbyval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getAttstorage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAttalign();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getAttnotnull();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getAtthasdef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getAttidentity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value16() {
        return getAttisdropped();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value17() {
        return getAttislocal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getAttinhcount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value19() {
        return getAttcollation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value20() {
        return getAttacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value21() {
        return getAttoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value22() {
        return getAttfdwoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value1(Long value) {
        setAttrelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value2(String value) {
        setAttname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value3(Long value) {
        setAtttypid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value4(Integer value) {
        setAttstattarget(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value5(Short value) {
        setAttlen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value6(Short value) {
        setAttnum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value7(Integer value) {
        setAttndims(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value8(Integer value) {
        setAttcacheoff(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value9(Integer value) {
        setAtttypmod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value10(Boolean value) {
        setAttbyval(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value11(String value) {
        setAttstorage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value12(String value) {
        setAttalign(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value13(Boolean value) {
        setAttnotnull(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value14(Boolean value) {
        setAtthasdef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value15(String value) {
        setAttidentity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value16(Boolean value) {
        setAttisdropped(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value17(Boolean value) {
        setAttislocal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value18(Integer value) {
        setAttinhcount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value19(Long value) {
        setAttcollation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value20(String... value) {
        setAttacl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value21(String... value) {
        setAttoptions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord value22(String... value) {
        setAttfdwoptions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAttributeRecord values(Long value1, String value2, Long value3, Integer value4, Short value5, Short value6, Integer value7, Integer value8, Integer value9, Boolean value10, String value11, String value12, Boolean value13, Boolean value14, String value15, Boolean value16, Boolean value17, Integer value18, Long value19, String[] value20, String[] value21, String[] value22) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgAttributeRecord
     */
    public PgAttributeRecord() {
        super(PgAttribute.PG_ATTRIBUTE);
    }

    /**
     * Create a detached, initialised PgAttributeRecord
     */
    public PgAttributeRecord(Long attrelid, String attname, Long atttypid, Integer attstattarget, Short attlen, Short attnum, Integer attndims, Integer attcacheoff, Integer atttypmod, Boolean attbyval, String attstorage, String attalign, Boolean attnotnull, Boolean atthasdef, String attidentity, Boolean attisdropped, Boolean attislocal, Integer attinhcount, Long attcollation, String[] attacl, String[] attoptions, String[] attfdwoptions) {
        super(PgAttribute.PG_ATTRIBUTE);

        set(0, attrelid);
        set(1, attname);
        set(2, atttypid);
        set(3, attstattarget);
        set(4, attlen);
        set(5, attnum);
        set(6, attndims);
        set(7, attcacheoff);
        set(8, atttypmod);
        set(9, attbyval);
        set(10, attstorage);
        set(11, attalign);
        set(12, attnotnull);
        set(13, atthasdef);
        set(14, attidentity);
        set(15, attisdropped);
        set(16, attislocal);
        set(17, attinhcount);
        set(18, attcollation);
        set(19, attacl);
        set(20, attoptions);
        set(21, attfdwoptions);
    }
}
