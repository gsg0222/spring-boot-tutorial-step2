package blog.tsuchiya.tutorial.step2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import blog.tsuchiya.tutorial.step2.controller.form.TestForm;

@Controller
public class FormController {

	@GetMapping("form/index")
	public String formIndex(Model model) {
		model.addAttribute("testForm", createForm());
		return "form/index";
	}
	
	/**
	 * フォームに表示するTestFormを生成する。
	 * 色々変更して遊んでみると練習になるはず。
	 * 
	 * @return テスト用TestForm
	 */
	private TestForm createForm() {
		var result = new TestForm();
		result.setText("テキストサンプル");
		result.setTextarea("テキストエリア\nサンプル");
		result.setSelect(2);
		result.setRadio("radioTest");
		result.setCheckBox("one");
		return result;
	}
	
	/**
	 * 入力したフォームの内容をそのまま
	 * JSON形式で出力する。
	 * ResponseBodyアノテーションは戻り値をJSONで表示するようにする。
	 * 
	 * @param testForm フォームからの入力
	 * @return 入力をそのまま返す
	 */
	@PostMapping("form/input")
	@ResponseBody
	public TestForm formInput(TestForm testForm) {
		return testForm;
	}
}
