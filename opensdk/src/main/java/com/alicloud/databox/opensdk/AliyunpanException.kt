package com.alicloud.databox.opensdk

open class AliyunpanException(open val code: String, override val message: String) : Exception(message) {
    override fun toString(): String {
        return "AliyunpanException(code='$code', message='$message')"
    }

    companion object {

        const val CODE_APP_NOT_INSTALL = "AppNotInstall"
        const val CODE_AUTH_REDIRECT_INVALID = "AuthRedirectInvalid"
        const val CODE_AUTH_REDIRECT_ERROR = "AuthRedirectError"

        const val CODE_REQUEST_INVALID = "RequestInvalid"

        inline fun String.buildError(message: String) = AliyunpanException(this, message)
    }
}