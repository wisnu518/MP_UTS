package com.wisnu.Uts_18090081.activity._main.presenter

import com.wisnu.Uts_18090081.model.Keranjang

interface MainView {
    fun onSuccessReportLastDay(keranjang: List<Keranjang?>?)
    fun onSuccessReportLastWeek(keranjang: List<Keranjang?>?)
    fun onSuccessReportLastMonth(keranjang: List<Keranjang?>?)
    fun onSuccessReportNowDay(keranjang: List<Keranjang?>?)
    fun onSuccessReportNowWeek(keranjang: List<Keranjang?>?)
    fun onSuccessReportNowMonth(keranjang: List<Keranjang?>?)

    fun onFailedReport(msg: String?)
}