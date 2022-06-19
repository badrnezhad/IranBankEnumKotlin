package utils

import enums.BankEnum

class Bank {
    companion object {

        fun getBankNameByBankEnum(bankEnum: BankEnum?): String {
            return try {
                when (bankEnum) {
                    BankEnum.None -> "نا مشخص"
                    BankEnum.Na -> "نا مشخص"
                    BankEnum.SaderatImprove -> "بانک توسعه صادرات ایران"
                    BankEnum.Entrepreneur -> "بانک کارآفرین"
                    BankEnum.Sepah -> "بانک سپه"
                    BankEnum.RefahWorkers -> "بانک رفاه کارگران"
                    BankEnum.Saderat -> "بانک صادرات ایران"
                    BankEnum.Agricultural -> "بانک کشاورزی"
                    BankEnum.Melli -> "بانک ملّی"
                    BankEnum.Mellat -> "بانک ملّت"
                    BankEnum.Saman -> "بانک سامان"
                    BankEnum.Parsian -> "بانک پارسیان"
                    BankEnum.Tejarat -> "بانک تجارت"
                    BankEnum.EgtesadNovin -> "بانک اقتصاد نوین"
                    BankEnum.PostBank -> "پست بانک ایران"
                    BankEnum.Industry -> "بانک صنعت و معدن"
                    BankEnum.Maskan -> "بانک مسکن"
                    BankEnum.ImproveCredential -> "موسسه اعتباری توسعه"
                    BankEnum.Central -> "بانک مرکزی"
                    BankEnum.Pasargad -> "بانک پاسارگاد"
                    BankEnum.Capital -> "بانک سرمایه"
                    BankEnum.City -> "بانک شهر"
                    BankEnum.CooperationImprove -> "بانک توسعه تعاون"
                    BankEnum.Dey -> "بانک دی"
                    BankEnum.Travel -> "بانک گردشگری"
                    BankEnum.IranZamin -> "بانک ایران زمین"
                    BankEnum.Kosar -> "موسسه اعتباری کوثر"
                    BankEnum.MeherIran -> "بانک  قرض الحسنه مهر ایران"
                    BankEnum.Ansar -> "بانک انصار"
                    BankEnum.Tat -> "بانک تات"
                    BankEnum.Hekmat -> "بانک حکمت ایرانیان"
                    BankEnum.Sina -> "بانک سینا"
                    BankEnum.MehrEghtesad -> "بانک مهر اقتصاد"
                    BankEnum.Ghavamin -> "بانک قوامین"
                    BankEnum.Ayande -> "بانک آینده"
                    BankEnum.Resalat -> "بانک رسالت"
                    else -> ""
                }
            } catch (e: Exception) {
                println(e.message)
                ""
            }
        }
    }
}