package com.example.wildcat.carol.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Wildcat on 4/15/2016.
 */
public class UserProfile {

    @SerializedName("FirstName")
    public String firstName;

    @SerializedName("LastName")
    public String lastName;

    @SerializedName("Coins")
    public int coins;

    @SerializedName("Household")
    public String household;


}
