package com.wisnu.Uts_18090081.activity.report.presenter

import com.wisnu.Uts_18090081.model.Keranjang

interface ReportView {
    fun onSuccessReport(keranjang: List<Keranjang?>?)
    fun onFailedReport(localizedMessage: String?)

    fun onSuccessRestore(msg: String?)
    fun onFailedRestore(msg: String?)
}