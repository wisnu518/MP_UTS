package com.wisnu.Uts_18090081.activity.login.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import com.wisnu.Uts_18090081.model.User

@Generated("com.robohorse.robopojogenerator")
data class ResultLogin(

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("user")
	val user: User? = null,

	@field:SerializedName("status")
	val status: Int? = null
)