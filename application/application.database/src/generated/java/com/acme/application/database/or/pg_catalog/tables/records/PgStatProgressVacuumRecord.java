/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables.records;


import com.acme.application.database.or.pg_catalog.tables.PgStatProgressVacuum;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class PgStatProgressVacuumRecord extends TableRecordImpl<PgStatProgressVacuumRecord> implements Record11<Integer, Long, String, Long, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -1166654404;

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.datid</code>.
     */
    public void setDatid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.datid</code>.
     */
    public Long getDatid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.datname</code>.
     */
    public void setDatname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.datname</code>.
     */
    public String getDatname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.relid</code>.
     */
    public void setRelid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.phase</code>.
     */
    public void setPhase(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.phase</code>.
     */
    public String getPhase() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_total</code>.
     */
    public void setHeapBlksTotal(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_total</code>.
     */
    public BigDecimal getHeapBlksTotal() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_scanned</code>.
     */
    public void setHeapBlksScanned(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_scanned</code>.
     */
    public BigDecimal getHeapBlksScanned() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_vacuumed</code>.
     */
    public void setHeapBlksVacuumed(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.heap_blks_vacuumed</code>.
     */
    public BigDecimal getHeapBlksVacuumed() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.index_vacuum_count</code>.
     */
    public void setIndexVacuumCount(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.index_vacuum_count</code>.
     */
    public BigDecimal getIndexVacuumCount() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.max_dead_tuples</code>.
     */
    public void setMaxDeadTuples(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.max_dead_tuples</code>.
     */
    public BigDecimal getMaxDeadTuples() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_progress_vacuum.num_dead_tuples</code>.
     */
    public void setNumDeadTuples(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_progress_vacuum.num_dead_tuples</code>.
     */
    public BigDecimal getNumDeadTuples() {
        return (BigDecimal) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Long, String, Long, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Long, String, Long, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM.PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM.DATID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM.DATNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM.RELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM.PHASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM.HEAP_BLKS_TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM.HEAP_BLKS_SCANNED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM.HEAP_BLKS_VACUUMED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM.INDEX_VACUUM_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM.MAX_DEAD_TUPLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM.NUM_DEAD_TUPLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getDatid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDatname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getRelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPhase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getHeapBlksTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getHeapBlksScanned();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getHeapBlksVacuumed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getIndexVacuumCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getMaxDeadTuples();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getNumDeadTuples();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getDatid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDatname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getRelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPhase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getHeapBlksTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getHeapBlksScanned();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getHeapBlksVacuumed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getIndexVacuumCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getMaxDeadTuples();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getNumDeadTuples();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatProgressVacuumRecord value1(Integer value) {
        setPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatProgressVacuumRecord value2(Long value) {
        setDatid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatProgressVacuumRecord value3(String value) {
        setDatname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatProgressVacuumRecord value4(Long value) {
        setRelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatProgressVacuumRecord value5(String value) {
        setPhase(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatProgressVacuumRecord value6(BigDecimal value) {
        setHeapBlksTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatProgressVacuumRecord value7(BigDecimal value) {
        setHeapBlksScanned(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatProgressVacuumRecord value8(BigDecimal value) {
        setHeapBlksVacuumed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatProgressVacuumRecord value9(BigDecimal value) {
        setIndexVacuumCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatProgressVacuumRecord value10(BigDecimal value) {
        setMaxDeadTuples(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatProgressVacuumRecord value11(BigDecimal value) {
        setNumDeadTuples(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatProgressVacuumRecord values(Integer value1, Long value2, String value3, Long value4, String value5, BigDecimal value6, BigDecimal value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, BigDecimal value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatProgressVacuumRecord
     */
    public PgStatProgressVacuumRecord() {
        super(PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM);
    }

    /**
     * Create a detached, initialised PgStatProgressVacuumRecord
     */
    public PgStatProgressVacuumRecord(Integer pid, Long datid, String datname, Long relid, String phase, BigDecimal heapBlksTotal, BigDecimal heapBlksScanned, BigDecimal heapBlksVacuumed, BigDecimal indexVacuumCount, BigDecimal maxDeadTuples, BigDecimal numDeadTuples) {
        super(PgStatProgressVacuum.PG_STAT_PROGRESS_VACUUM);

        set(0, pid);
        set(1, datid);
        set(2, datname);
        set(3, relid);
        set(4, phase);
        set(5, heapBlksTotal);
        set(6, heapBlksScanned);
        set(7, heapBlksVacuumed);
        set(8, indexVacuumCount);
        set(9, maxDeadTuples);
        set(10, numDeadTuples);
    }
}
