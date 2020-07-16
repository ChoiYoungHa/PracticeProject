package LifeCoding;

@Controller
public class UserController {
	
	/* resource name = "service"�� �־�� �޸� �ö��� �־ service�� �̵��� �� �ִ�.*/
	@Resource(name = "UserService") IUserService UserService;
	 
	
	private Logger log = Logger.getLogger(this.getClass());
	
	/* �α��� ȭ�� ��ȯ�ϱ� */
	@RequestMapping(value="user/userLogin")
	public String userLogin() {
		log.info(this.getClass() +"user/userLogin start!");
		log.info(this.getClass() +"user/userLogin end!");
		return "/user/userLogin";
	
}
	/*�α��� id, pwd Ȯ���ϱ� */
	@RequestMapping("user/userLoginProc")
	public String userLoginProc(HttpServletRequest request, HttpSession session, Model model)throws Exception{
		
		log.info("user/userLoginProc start!!");
		//mappig ""�� jsp form���� action�̶� ���ƾ���.
		//request("") = jsp input name�� ���ƾ��Ѵ�.
		//cmmutil.nvl�� util �Լ��� null���� �������� �ٲ��ش�.
		String id = CmmUtil.nvl(request.getParameter("id"));
		String pwd = CmmUtil.nvl(request.getParameter("pwd"));
		
		log.info("id :" + id);
		log.info("pwd :" + pwd);
	
		//userdto ����� ���� �޸����� �÷���
		UserDTO uDTO = new UserDTO();
		
		//userdto�� ���� ����
		uDTO.setId(id);
		uDTO.setPwd(pwd);
		String msg;
		String url;


		//user Service�� ������
		uDTO = UserService.getLoginInfo(uDTO);
		if(uDTO != null) {
			log.info("uDTO id : " + uDTO.getId());
			log.info("uDTO name : " + uDTO.getName());
			msg="�α��� ����!";
			session.setAttribute("id",uDTO.getId());
			session.setAttribute("name", uDTO.getName());
		}else {
			msg="�α��� ����";
		}
		url ="/";
		
		model.addAttribute("msg",msg);
		model.addAttribute("url",url);
		
		log.info("user/userLoginProc end !!!");
		return "/redirect";
	
	}
	
	/* �α׾ƿ� */
	@RequestMapping(value="/user/userLogout")
	public String logout(HttpSession session, Model model)throws Exception{
		log.info("logout start!");
		
		String msg ="";
		String url ="";
		msg ="�α׾ƿ� ����!";
		url="/";
		session.invalidate();
		
		model.addAttribute("msg",msg);
		model.addAttribute("url",url);
		
		log.info("logout end!!");
		return "/redirect";
	}
}