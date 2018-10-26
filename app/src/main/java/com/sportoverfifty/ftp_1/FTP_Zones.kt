package com.sportoverfifty.ftp_1

data class FTP_Zones (val zone: String, val name: String, val watts_percent: String, var ftp: Double ){

    private val mWatts_percent: String = watts_percent
    private var mFtp: Double = ftp

    fun calcWatts (mWatts_percent:String, mftp:Double) : Double{

        var ftpResult: Double = 0.0

        ftpResult = mFtp * 100 / watts_percent.toDouble()
        return ftpResult
    }

}