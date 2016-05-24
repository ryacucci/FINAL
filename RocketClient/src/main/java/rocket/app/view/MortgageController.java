package rocket.app.view;



import eNums.eAction;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import rocket.app.MainApp;
import rocketCode.Action;
import rocketData.LoanRequest;

public class MortgageController {

	private MainApp mainApp;
	
	//	TODO - RocketClient.RocketMainController
	private TextField txtIncome ;
	private TextField txtExpenses ;
	private TextField txtCreditScore ;
	private TextField txtHouseCost ;
	private ComboBox cmbTerm;
	private Label Income ;
	private Label MonthlyExpenses ;
	private Label CreditScore ;
	private Label CostofDesiredHouse ;
	private Label ChooseTerm ;
	private Button Payment;
	private Label lblMortgagePayment;

	private String dAmount;

	private String dPayment;

	private String dRate;

	private String expenses;

	private String iCreditScore;

	private String iDownPayment;

	private String iTerm;
	
	//	Create private instance variables for:
	//		TextBox  - 	txtIncome
	//		TextBox  - 	txtExpenses
	//		TextBox  - 	txtCreditScore
	//		TextBox  - 	txtHouseCost
	//		ComboBox -	loan term... 15 year or 30 year
	//		Labels   -  various labels for the controls
	//		Button   -  button to calculate the loan payment
	//		Label    -  to show error messages (exception throw, payment exception)

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	
	//	TODO - RocketClient.RocketMainController
	//			Call this when btnPayment is pressed, calculate the payment
	@FXML
	public void btnCalculatePayment(ActionEvent event)
	{
		Object message = null;
		//	TODO - RocketClient.RocketMainController
		
		Action a = new Action(eAction.CalculatePayment);
		LoanRequest lq = new LoanRequest();
		lq.setdAmount( Double.parseDouble(dAmount));
		lq.setdPayment(Double.parseDouble(dPayment));
		lq.setdRate (Double.parseDouble(dRate));
		lq.setExpenses (Double.parseDouble(expenses));
		lq.setiCreditScore (Double.parseDouble(iCreditScore));
		lq.setiDownPayment (Double.parseDouble(iDownPayment));
		lq.setiTerm (Double.parseDouble(iTerm));
		//	TODO - RocketClient.RocketMainController
		//			set the loan request details...  rate, term, amount, credit score, downpayment
		//			I've created you an instance of lq...  execute the setters in lq

		a.setLoanRequest(lq);
		
		//	send lq as a message to RocketHub		
		mainApp.messageSend(lq);
	}
	
	public void HandleLoanRequestDetails(LoanRequest lRequest)
	{
		//	TODO - RocketClient.HandleLoanRequestDetails
		//			lRequest is an instance of LoanRequest.
		//			after it's returned back from the server, the payment (dPayment)
		//			should be calculated.
		//			Display dPayment on the form, rounded to two decimal places
		lblMortgagePayment.setText(dPayment);
	}
}
