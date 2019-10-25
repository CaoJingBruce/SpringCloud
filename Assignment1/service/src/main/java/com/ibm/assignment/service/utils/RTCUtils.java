package com.ibm.assignment.service.utils;
import org.springframework.stereotype.Service;



@Service
public class RTCUtils {
//	private static LoginHandler loginHandler;
//	private static ITeamRepository teamRepository;
//	private static IProcessClientService processClient;
//	private static IAuditableClient auditableClient;
//	private static IProjectArea projectArea;
//
//	public static void init() throws TeamRepositoryException{
//		//loginHandler = new LoginHandler(Configer.getRtcuserid(), Configer.getRtcpassword());
//		//TeamPlatform.startup();
//		//teamRepository = TeamPlatform.getTeamRepositoryService().getTeamRepository(Configer.getRepositoryAddress());
//		//teamRepository.registerLoginHandler(loginHandler);
//
//		//teamRepository.login(null);
//
//		//processClient = (IProcessClientService) teamRepository.getClientLibrary(IProcessClientService.class);
//		//auditableClient = (IAuditableClient) teamRepository.getClientLibrary(IAuditableClient.class);
//
//		//get project area
//		//URI uri= URI.create(Configer.getProjectname().replaceAll(" ", "%20"));
//		//projectArea = (IProjectArea) processClient.findProcessArea(uri, null, null);
//	}
//
//	public static LoginHandler getLoginHandler() {
//		return loginHandler;
//	}
//
//
//
//	public static void setLoginHandler(LoginHandler loginHandler) {
//		RTCService.loginHandler = loginHandler;
//	}
//
//
//
//	public static ITeamRepository getTeamRepository() throws TeamRepositoryException {
//		if(teamRepository == null){
//			loginHandler = new LoginHandler(RTCAuth.getRtcUserId(), RTCAuth.getRtcPassword());
//			TeamPlatform.startup();
//			teamRepository = TeamPlatform.getTeamRepositoryService().getTeamRepository(RTCAuth.getRtcRepositoryAddress());
//			teamRepository.registerLoginHandler(loginHandler);
//
//			teamRepository.login(null);
//		}
//
//		return teamRepository;
//	}
//
//
//
//	public static void setTeamRepository(ITeamRepository teamRepository) {
//		RTCService.teamRepository = teamRepository;
//	}
//
//
//
//	public static IProcessClientService getProcessClient() {
//		if(processClient == null){
//			processClient = (IProcessClientService) teamRepository.getClientLibrary(IProcessClientService.class);
//		}
//
//		return processClient;
//	}
//
//
//
//	public static void setProcessClient(IProcessClientService processClient) {
//		RTCService.processClient = processClient;
//	}
//
//
//
//	public static IAuditableClient getAuditableClient() throws TeamRepositoryException {
//		if(auditableClient == null){
//			auditableClient = (IAuditableClient) getTeamRepository().getClientLibrary(IAuditableClient.class);
//		}
//		return auditableClient;
//	}
//
//
//
//	public static void setAuditableClient(IAuditableClient auditableClient) {
//		RTCService.auditableClient = auditableClient;
//	}
//
//
//
//	public static IProjectArea getProjectArea() throws TeamRepositoryException {
//		if(projectArea == null){
//			URI uri= URI.create(RTCAuth.getRtcProjectName().replaceAll(" ", "%20"));
//			projectArea = (IProjectArea) getProcessClient().findProcessArea(uri, null, null);
//		}
//		return projectArea;
//	}
//
//
//
//	public static void setProjectArea(IProjectArea projectArea) {
//		RTCService.projectArea = projectArea;
//	}
//
//
//
//	private static class LoginHandler implements ILoginHandler, ILoginInfo {
//
//		private String fUserId;
//		private String fPassword;
//
//		private LoginHandler(String userId, String password) {
//			fUserId = userId;
//			fPassword = password;
//		}
//
//		@Override
//		public String getPassword() {
//			// TODO Auto-generated method stub
//			return fPassword;
//		}
//
//		@Override
//		public String getUserId() {
//			// TODO Auto-generated method stub
//			return fUserId;
//		}
//
//		@Override
//		public ILoginInfo challenge(ITeamRepository arg0) {
//			// TODO Auto-generated method stub
//			return this;
//		}
//
//	}

	public String getRtcInfo() {
		return "RTC connected.";
	}
}
