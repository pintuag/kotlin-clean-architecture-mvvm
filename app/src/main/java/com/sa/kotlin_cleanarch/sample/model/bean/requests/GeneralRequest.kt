package com.sa.kotlin_cleanarch.sample.model.bean.requests

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class GeneralRequest : Serializable {

    @SerializedName("token")
    var token: String = ""

}