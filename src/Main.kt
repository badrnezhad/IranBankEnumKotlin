import utils.Bank.Companion.getBankNameByBankEnum
import utils.Card.Companion.getBankEnumByCardNumber
import utils.IBAN.Companion.getBankEnumByShebaNumber

fun main() {
    try {
        val shebaNumber = "IR000100000000203456078900"
        val cardNumber = "0100000010001"
        val shebaBankName =
            getBankNameByBankEnum(getBankEnumByShebaNumber(shebaNumber))
        val cardBankName =
            getBankNameByBankEnum(getBankEnumByCardNumber(cardNumber))
        println("Sheba => $shebaNumber : $shebaBankName")
        println("Card => $cardNumber : $cardBankName")
    } catch (e: Exception) {
        println(e.message)
    }
}