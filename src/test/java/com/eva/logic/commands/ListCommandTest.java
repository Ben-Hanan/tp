package com.eva.logic.commands;

/*
TODO
import static com.eva.logic.commands.CommandTestUtil.assertCommandSuccess;
import static com.eva.logic.commands.CommandTestUtil.showPersonAtIndex;
import static com.eva.testutil.TypicalIndexes.INDEX_FIRST_PERSON;
 */
import static com.eva.testutil.TypicalPersons.getTypicalApplicantDatabase;
import static com.eva.testutil.TypicalPersons.getTypicalPersonDatabase;
import static com.eva.testutil.TypicalPersons.getTypicalStaffDatabase;

import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

import com.eva.model.Model;
import com.eva.model.ModelManager;
import com.eva.model.UserPrefs;

/**
 * Contains integration tests (interaction with the Model) and unit tests for ListCommand.
 */
public class ListCommandTest {

    private Model model;
    private Model expectedModel;

    @BeforeEach
    public void setUp() {
        model = new ModelManager(getTypicalPersonDatabase(), getTypicalStaffDatabase(),
                getTypicalApplicantDatabase(), new UserPrefs());
        expectedModel = new ModelManager(model.getPersonDatabase(), model.getStaffDatabase(),
                model.getApplicantDatabase(), new UserPrefs());
    }

    /*
    @Test
    public void execute_listIsNotFiltered_showsSameList() {
        assertCommandSuccess(new ListCommand(), model, ListCommand.MESSAGE_SUCCESS, expectedModel);
    }

    @Test
    public void execute_listIsFiltered_showsEverything() {
        showPersonAtIndex(model, INDEX_FIRST_PERSON);
        assertCommandSuccess(new ListCommand(), model, ListCommand.MESSAGE_SUCCESS, expectedModel);
    }
     */
}
