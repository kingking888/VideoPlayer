package com.tainzhi.mediaspider

/**
 * File:     TvProgramBean
 * Author:   tainzhi
 * Created:  2020/12/7 17:46
 * Mail:     QFQ61@qq.com
 * Description:
 */
data class TvProgramBean(
        val liveProgram: String,
        // 节目开始时间
        val liveProgramTime: String,
        val nextProgram: String,
        val nextProgramTime: String
)
