package utils

import enums.BankEnum

class Card {
    companion object {

        fun getBankEnumByCardNumber(cardNumber: String): BankEnum {
            var cardNumber = cardNumber
            return try {
                cardNumber = cardNumber.replace("-", "")
                if (cardNumber.length != 16) return BankEnum.Na
                val cardFormat = cardNumber.substring(0, 6)
                getBankEnumByCardFormat(cardFormat)
            } catch (e: Exception) {
                println(e.message)
                BankEnum.Na
            }
        }

        fun getCardFormat(bankEnum: BankEnum?): Array<String> {
            return try {
                when (bankEnum) {
                    BankEnum.None -> arrayOf("0")
                    BankEnum.Na -> arrayOf("0")
                    BankEnum.SaderatImprove -> arrayOf("207177", "627648")
                    BankEnum.Entrepreneur -> arrayOf("603770", "639217")
                    BankEnum.Sepah -> arrayOf("589210")
                    BankEnum.RefahWorkers -> arrayOf("589463")
                    BankEnum.Saderat -> arrayOf("603769")
                    BankEnum.Agricultural -> arrayOf("603770", "639217")
                    BankEnum.Melli -> arrayOf("603799")
                    BankEnum.Mellat -> arrayOf("610433", "991975")
                    BankEnum.Saman -> arrayOf("621986")
                    BankEnum.Parsian -> arrayOf("622106", "627884", "639194")
                    BankEnum.Tejarat -> arrayOf("627353")
                    BankEnum.EgtesadNovin -> arrayOf("627412")
                    BankEnum.PostBank -> arrayOf("627760")
                    BankEnum.Industry -> arrayOf("627961")
                    BankEnum.Maskan -> arrayOf("628023")
                    BankEnum.ImproveCredential -> arrayOf("628157")
                    BankEnum.Central -> arrayOf("636795")
                    BankEnum.Pasargad -> arrayOf("502229", "639347")
                    BankEnum.Capital -> arrayOf("639607", "504706")
                    BankEnum.City -> arrayOf("502806")
                    BankEnum.CooperationImprove -> arrayOf("502908")
                    BankEnum.Dey -> arrayOf("502938")
                    BankEnum.Travel -> arrayOf("505416")
                    BankEnum.IranZamin -> arrayOf("505785")
                    BankEnum.Kosar -> arrayOf("505801")
                    BankEnum.MeherIran -> arrayOf("606373")
                    BankEnum.Ansar -> arrayOf("627381")
                    BankEnum.Tat -> arrayOf("636214")
                    BankEnum.Hekmat -> arrayOf("636949")
                    BankEnum.Sina -> arrayOf("639346")
                    BankEnum.MehrEghtesad -> arrayOf("639370")
                    BankEnum.Ghavamin -> arrayOf("639599")
                    BankEnum.Ayande -> arrayOf("")
                    BankEnum.Resalat -> arrayOf("")
                    else -> arrayOf("0")
                }
            } catch (e: Exception) {
                println(e.message)
                arrayOf("0")
            }
        }

        fun getBankEnumByCardFormat(cardFormat: String?): BankEnum {
            return try {
                when (cardFormat) {
                    "0" -> BankEnum.Na
                    "207177", "627648" -> BankEnum.SaderatImprove
                    "502910", "627488" -> BankEnum.Entrepreneur
                    "589210" -> BankEnum.Sepah
                    "589463" -> BankEnum.RefahWorkers
                    "603769" -> BankEnum.Saderat
                    "603770", "639217" -> BankEnum.Agricultural
                    "603799" -> BankEnum.Melli
                    "610433", "991975" -> BankEnum.Mellat
                    "621986" -> BankEnum.Saman
                    "622106", "627884", "639194" -> BankEnum.Parsian
                    "627353" -> BankEnum.Tejarat
                    "627412" -> BankEnum.EgtesadNovin
                    "627760" -> BankEnum.PostBank
                    "627961" -> BankEnum.Industry
                    "628023" -> BankEnum.Maskan
                    "628157" -> BankEnum.ImproveCredential
                    "636795" -> BankEnum.Central
                    "502229", "639347" -> BankEnum.Pasargad
                    "639607" -> BankEnum.Capital
                    "502806", "504706" -> BankEnum.City
                    "502908" -> BankEnum.CooperationImprove
                    "502938" -> BankEnum.Dey
                    "505416" -> BankEnum.Travel
                    "505785" -> BankEnum.IranZamin
                    "505801" -> BankEnum.Kosar
                    "606373" -> BankEnum.MeherIran
                    "627381" -> BankEnum.Ansar
                    "636214" -> BankEnum.Tat
                    "636949" -> BankEnum.Hekmat
                    "639346" -> BankEnum.Sina
                    "639370" -> BankEnum.MehrEghtesad
                    "639599" -> BankEnum.Ghavamin
                    else -> BankEnum.Na
                }
            } catch (e: Exception) {
                println(e.message)
                BankEnum.Na
            }
        }
    }
}