package com.wisnu.Uts_18090081.activity.penjualan.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import com.wisnu.Uts_18090081.model.Barang

@Generated("com.robohorse.robopojogenerator")
data class ResultSearchBarang(

	@field:SerializedName("barang")
	val barang: List<Barang?>? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Int? = null
)