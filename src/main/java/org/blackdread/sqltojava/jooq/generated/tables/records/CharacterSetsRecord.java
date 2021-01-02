/*
 * This file is generated by jOOQ.
 */
package org.blackdread.sqltojava.jooq.generated.tables.records;


import org.blackdread.sqltojava.jooq.generated.tables.CharacterSets;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class CharacterSetsRecord extends TableRecordImpl<CharacterSetsRecord> implements Record4<String, String, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached CharacterSetsRecord
     */
    public CharacterSetsRecord() {
        super(CharacterSets.CHARACTER_SETS);
    }

    /**
     * Create a detached, initialised CharacterSetsRecord
     */
    public CharacterSetsRecord(String characterSetName, String defaultCollateName, String description, Long maxlen) {
        super(CharacterSets.CHARACTER_SETS);

        setCharacterSetName(characterSetName);
        setDefaultCollateName(defaultCollateName);
        setDescription(description);
        setMaxlen(maxlen);
    }

    /**
     * Getter for <code>information_schema.CHARACTER_SETS.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.CHARACTER_SETS.CHARACTER_SET_NAME</code>.
     */
    public void setCharacterSetName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.CHARACTER_SETS.DEFAULT_COLLATE_NAME</code>.
     */
    public String getDefaultCollateName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.CHARACTER_SETS.DEFAULT_COLLATE_NAME</code>.
     */
    public void setDefaultCollateName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.CHARACTER_SETS.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.CHARACTER_SETS.DESCRIPTION</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>information_schema.CHARACTER_SETS.MAXLEN</code>.
     */
    public Long getMaxlen() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>information_schema.CHARACTER_SETS.MAXLEN</code>.
     */
    public void setMaxlen(Long value) {
        set(3, value);
    }

    @Override
    public Row4<String, String, String, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return CharacterSets.CHARACTER_SETS.CHARACTER_SET_NAME;
    }

    @Override
    public Field<String> field2() {
        return CharacterSets.CHARACTER_SETS.DEFAULT_COLLATE_NAME;
    }

    @Override
    public Field<String> field3() {
        return CharacterSets.CHARACTER_SETS.DESCRIPTION;
    }

    @Override
    public Field<Long> field4() {
        return CharacterSets.CHARACTER_SETS.MAXLEN;
    }

    @Override
    public String component1() {
        return getCharacterSetName();
    }

    @Override
    public String component2() {
        return getDefaultCollateName();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Long component4() {
        return getMaxlen();
    }

    @Override
    public String value1() {
        return getCharacterSetName();
    }

    @Override
    public String value2() {
        return getDefaultCollateName();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public Long value4() {
        return getMaxlen();
    }

    @Override
    public CharacterSetsRecord value1(String value) {
        setCharacterSetName(value);
        return this;
    }

    @Override
    public CharacterSetsRecord value2(String value) {
        setDefaultCollateName(value);
        return this;
    }

    @Override
    public CharacterSetsRecord value3(String value) {
        setDescription(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public CharacterSetsRecord value4(Long value) {
        setMaxlen(value);
        return this;
    }

    @Override
    public CharacterSetsRecord values(String value1, String value2, String value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }
}
