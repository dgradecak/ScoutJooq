/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.information_schema.tables;


import ${package}.database.or.information_schema.InformationSchema;
import ${package}.database.or.information_schema.tables.records.CharacterSetsRecord;

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
public class CharacterSets extends TableImpl<CharacterSetsRecord> {

    private static final long serialVersionUID = -1201602933;

    /**
     * The reference instance of <code>information_schema.character_sets</code>
     */
    public static final CharacterSets CHARACTER_SETS = new CharacterSets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CharacterSetsRecord> getRecordType() {
        return CharacterSetsRecord.class;
    }

    /**
     * The column <code>information_schema.character_sets.character_set_catalog</code>.
     */
    public final TableField<CharacterSetsRecord, String> CHARACTER_SET_CATALOG = createField("character_set_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.character_sets.character_set_schema</code>.
     */
    public final TableField<CharacterSetsRecord, String> CHARACTER_SET_SCHEMA = createField("character_set_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.character_sets.character_set_name</code>.
     */
    public final TableField<CharacterSetsRecord, String> CHARACTER_SET_NAME = createField("character_set_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.character_sets.character_repertoire</code>.
     */
    public final TableField<CharacterSetsRecord, String> CHARACTER_REPERTOIRE = createField("character_repertoire", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.character_sets.form_of_use</code>.
     */
    public final TableField<CharacterSetsRecord, String> FORM_OF_USE = createField("form_of_use", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.character_sets.default_collate_catalog</code>.
     */
    public final TableField<CharacterSetsRecord, String> DEFAULT_COLLATE_CATALOG = createField("default_collate_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.character_sets.default_collate_schema</code>.
     */
    public final TableField<CharacterSetsRecord, String> DEFAULT_COLLATE_SCHEMA = createField("default_collate_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.character_sets.default_collate_name</code>.
     */
    public final TableField<CharacterSetsRecord, String> DEFAULT_COLLATE_NAME = createField("default_collate_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.character_sets</code> table reference
     */
    public CharacterSets() {
        this(DSL.name("character_sets"), null);
    }

    /**
     * Create an aliased <code>information_schema.character_sets</code> table reference
     */
    public CharacterSets(String alias) {
        this(DSL.name(alias), CHARACTER_SETS);
    }

    /**
     * Create an aliased <code>information_schema.character_sets</code> table reference
     */
    public CharacterSets(Name alias) {
        this(alias, CHARACTER_SETS);
    }

    private CharacterSets(Name alias, Table<CharacterSetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CharacterSets(Name alias, Table<CharacterSetsRecord> aliased, Field<?>[] parameters) {
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
    public CharacterSets as(String alias) {
        return new CharacterSets(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CharacterSets as(Name alias) {
        return new CharacterSets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterSets rename(String name) {
        return new CharacterSets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterSets rename(Name name) {
        return new CharacterSets(name, null);
    }
}
