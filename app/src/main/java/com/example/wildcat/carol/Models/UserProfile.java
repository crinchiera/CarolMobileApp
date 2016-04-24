package com.example.wildcat.carol.Models;

import com.google.gson.annotations.SerializedName;

import java.util.Hashtable;

/**
 * Created by Wildcat on 4/15/2016.
 */
public class UserProfile {

    @SerializedName("FirstName")
    public String firstName;

    @SerializedName("LastName")
    public String lastName;

    @SerializedName("ChoresCompletedList")
    public Hashtable completedList;

    @SerializedName("ChoresToDoList")
    public Hashtable toDoList;

    @SerializedName("Coins")
    public int coins;

    @SerializedName("ChoresCompleted")
    public int completed;

    @SerializedName("ChoresToDo")
    public int toDO;

    @SerializedName("Household")
    public String household;


}
