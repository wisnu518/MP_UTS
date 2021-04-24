package com.wisnu.Uts_18090081.activity.login

import com.wisnu.Uts_18090081.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}