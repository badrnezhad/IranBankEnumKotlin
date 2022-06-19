package utils

import enums.BankEnum
import java.math.BigInteger
import java.util.*

class IBAN {
    companion object {

        fun getBankEnumByShebaNumber(shebaNumber: String): BankEnum {
            var shebaNumber = shebaNumber
            return try {
                shebaNumber = shebaNumber.replace("-", "")
                if (!isValidSheba(shebaNumber)) return BankEnum.Na
                val shebaFormat = shebaNumber.substring(4, 7)
                getBankEnumByShebaFormat(shebaFormat)
            } catch (e: Exception) {
                println(e.message)
                BankEnum.Na
            }
        }

        fun getShebaFormat(bankEnum: BankEnum?): Array<String> {
            return try {
                when (bankEnum) {
                    BankEnum.None -> arrayOf("0")
                    BankEnum.Na -> arrayOf("0")
                    BankEnum.SaderatImprove -> arrayOf("020")
                    BankEnum.Entrepreneur -> arrayOf("053")
                    BankEnum.Sepah -> arrayOf("015")
                    BankEnum.RefahWorkers -> arrayOf("013")
                    BankEnum.Saderat -> arrayOf("019")
                    BankEnum.Agricultural -> arrayOf("016")
                    BankEnum.Melli -> arrayOf("017")
                    BankEnum.Mellat -> arrayOf("012")
                    BankEnum.Saman -> arrayOf("056")
                    BankEnum.Parsian -> arrayOf("054")
                    BankEnum.Tejarat -> arrayOf("018")
                    BankEnum.EgtesadNovin -> arrayOf("055")
                    BankEnum.PostBank -> arrayOf("021")
                    BankEnum.Industry -> arrayOf("011")
                    BankEnum.Maskan -> arrayOf("014")
                    BankEnum.ImproveCredential -> arrayOf("051")
                    BankEnum.Central -> arrayOf("010")
                    BankEnum.Pasargad -> arrayOf("057")
                    BankEnum.Capital -> arrayOf("058")
                    BankEnum.City -> arrayOf("061")
                    BankEnum.CooperationImprove -> arrayOf("022")
                    BankEnum.Dey -> arrayOf("066")
                    BankEnum.Travel -> arrayOf("064")
                    BankEnum.IranZamin -> arrayOf("069")
                    BankEnum.Kosar -> arrayOf("")
                    BankEnum.MeherIran -> arrayOf("060")
                    BankEnum.Ansar -> arrayOf("063")
                    BankEnum.Tat -> arrayOf("")
                    BankEnum.Hekmat -> arrayOf("065")
                    BankEnum.Sina -> arrayOf("059")
                    BankEnum.MehrEghtesad -> arrayOf("")
                    BankEnum.Ghavamin -> arrayOf("")
                    BankEnum.Ayande -> arrayOf("062")
                    BankEnum.Resalat -> arrayOf("070")
                    else -> arrayOf("0")
                }
            } catch (e: Exception) {
                println(e.message)
                arrayOf("0")
            }
        }

        fun isValidSheba(sheba: String): Boolean {
            var sheba = sheba
            return try {
                sheba = sheba.uppercase(Locale.getDefault())
                sheba = sheba.replace("A", "10")
                sheba = sheba.replace("B", "11")
                sheba = sheba.replace("C", "12")
                sheba = sheba.replace("D", "13")
                sheba = sheba.replace("E", "14")
                sheba = sheba.replace("F", "15")
                sheba = sheba.replace("G", "16")
                sheba = sheba.replace("H", "17")
                sheba = sheba.replace("I", "18")
                sheba = sheba.replace("J", "19")
                sheba = sheba.replace("K", "20")
                sheba = sheba.replace("L", "21")
                sheba = sheba.replace("M", "22")
                sheba = sheba.replace("N", "23")
                sheba = sheba.replace("O", "24")
                sheba = sheba.replace("P", "25")
                sheba = sheba.replace("Q", "26")
                sheba = sheba.replace("R", "27")
                sheba = sheba.replace("S", "28")
                sheba = sheba.replace("T", "29")
                sheba = sheba.replace("U", "30")
                sheba = sheba.replace("V", "31")
                sheba = sheba.replace("W", "32")
                sheba = sheba.replace("X", "33")
                sheba = sheba.replace("Y", "34")
                sheba = sheba.replace("Z", "35")
                val res = sheba.substring(0, 6)
                sheba += res
                val finalSheba = sheba.substring(6, sheba.length)
                val value = BigInteger(finalSheba)
                val nineSeven = BigInteger("97")
                val remain: BigInteger = value.remainder(nineSeven)
                remain.compareTo(BigInteger("1")) === 0
            } catch (e: Exception) {
                println(e.message)
                false
            }
        }

        fun splitSheba(sheba: String): String? {
            return try {
                var print = ""
                var div = 3
                var index = 0
                if (sheba.length > 1 && sheba.substring(0, 2)
                        .uppercase(Locale.getDefault()) === "IR"
                ) {
                    div = 1
                    index = 2
                    print += "IR-"
                }
                if (sheba.length > 2) {
                    for (i in index until sheba.length) {
                        if (i % 4 == div) {
                            if (i == sheba.length - 1) print += sheba.toCharArray()[i] else print += sheba.toCharArray()[i].toString() + "-"
                        } else print += sheba.toCharArray()[i]
                    }
                    return print
                }
                sheba
            } catch (e: Exception) {
                println(e.message)
                null
            }
        }

        fun getBankEnumByShebaFormat(cardFormat: String?): BankEnum {
            return try {
                when (cardFormat) {
                    "0" -> BankEnum.Na
                    "020" -> BankEnum.SaderatImprove
                    "053" -> BankEnum.Entrepreneur
                    "015" -> BankEnum.Sepah
                    "013" -> BankEnum.RefahWorkers
                    "019" -> BankEnum.Saderat
                    "016" -> BankEnum.Agricultural
                    "017" -> BankEnum.Melli
                    "012" -> BankEnum.Mellat
                    "056" -> BankEnum.Saman
                    "054" -> BankEnum.Parsian
                    "018" -> BankEnum.Tejarat
                    "055" -> BankEnum.EgtesadNovin
                    "021" -> BankEnum.PostBank
                    "011" -> BankEnum.Industry
                    "014" -> BankEnum.Maskan
                    "051" -> BankEnum.ImproveCredential
                    "010" -> BankEnum.Central
                    "057" -> BankEnum.Pasargad
                    "058" -> BankEnum.Capital
                    "061" -> BankEnum.City
                    "022" -> BankEnum.CooperationImprove
                    "066" -> BankEnum.Dey
                    "064" -> BankEnum.Travel
                    "069" -> BankEnum.IranZamin
                    "060" -> BankEnum.MeherIran
                    "063" -> BankEnum.Ansar
                    "065" -> BankEnum.Hekmat
                    "059" -> BankEnum.Sina
                    "062" -> BankEnum.Ayande
                    "070" -> BankEnum.Resalat
                    else -> BankEnum.Na
                }
            } catch (e: Exception) {
                println(e.message)
                BankEnum.Na
            }
        }
    }
}