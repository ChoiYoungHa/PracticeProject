package LifeCoding;

@Controller
public class UserController {
	
	/* resource name = "service"가 있어야 메모리 올라가져 있어서 service로 이동할 수 있다.*/
	@Resource(name = "UserService") IUserService UserService;
	 
	
	private Logger log = Logger.getLogger(this.getClass());
	
	/* 로그인 화면 반환하기 */
	@RequestMapping(value="user/userLogin")
	public String userLogin() {
		log.info(this.getClass() +"user/userLogin start!");
		log.info(this.getClass() +"user/userLogin end!");
		return "/user/userLogin";
	
}
	/*로그인 id, pwd 확인하기 */
	@RequestMapping("user/userLoginProc")
	public String userLoginProc(HttpServletRequest request, HttpSession session, Model model)throws Exception{
		
		log.info("user/userLoginProc start!!");
		//mappig ""은 jsp form에서 action이랑 같아야함.
		//request("") = jsp input name과 같아야한다.
		//cmmutil.nvl은 util 함수로 null값을 공백으로 바꿔준다.
		String id = CmmUtil.nvl(request.getParameter("id"));
		String pwd = CmmUtil.nvl(request.getParameter("pwd"));
		
		log.info("id :" + id);
		log.info("pwd :" + pwd);
	
		//userdto 사용을 위해 메모리위에 올려줌
		UserDTO uDTO = new UserDTO();
		
		//userdto를 통해 세팅
		uDTO.setId(id);
		uDTO.setPwd(pwd);
		String msg;
		String url;


		//user Service로 보내기
		uDTO = UserService.getLoginInfo(uDTO);
		if(uDTO != null) {
			log.info("uDTO id : " + uDTO.getId());
			log.info("uDTO name : " + uDTO.getName());
			msg="로그인 성공!";
			session.setAttribute("id",uDTO.getId());
			session.setAttribute("name", uDTO.getName());
		}else {
			msg="로그인 실패";
		}
		url ="/";
		
		model.addAttribute("msg",msg);
		model.addAttribute("url",url);
		
		log.info("user/userLoginProc end !!!");
		return "/redirect";
	
	}
	
	/* 로그아웃 */
	@RequestMapping(value="/user/userLogout")
	public String logout(HttpSession session, Model model)throws Exception{
		log.info("logout start!");
		
		String msg ="";
		String url ="";
		msg ="로그아웃 성공!";
		url="/";
		session.invalidate();
		
		model.addAttribute("msg",msg);
		model.addAttribute("url",url);
		
		log.info("logout end!!");
		return "/redirect";
	}
}