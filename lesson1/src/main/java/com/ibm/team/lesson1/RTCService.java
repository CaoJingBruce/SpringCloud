package com.ibm.team.lesson1;

import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;


import com.ibm.team.repository.client.ILoginHandler2;
import com.ibm.team.repository.client.ILoginInfo2;
import com.ibm.team.repository.client.ITeamRepository;
import com.ibm.team.repository.client.TeamPlatform;
import com.ibm.team.repository.client.login.UsernameAndPasswordLoginInfo;
import com.ibm.team.repository.common.TeamRepositoryException;

import com.ibm.team.scm.client.IWorkspaceManager;
import com.ibm.team.scm.client.SCMPlatform;


public class RTCService {

	private String jazzURI = "https://jazz05.rchland.ibm.com:12443/jazz/";
	private String jazzID = "caojwh@cn.ibm.com";
	private String jazzPassword = "dog.pig.ice-321";
	private static ITeamRepository repo = null;
	private static IWorkspaceManager wm = null;

	public String loginRTC() {
		try {
            if(jazzURI == null || jazzURI.equalsIgnoreCase("")) return "login";
            // Login to the repository using the provided credentials
            repo = TeamPlatform.getTeamRepositoryService().getTeamRepository(
                    jazzURI);
            repo.registerLoginHandler(new ILoginHandler2() {
                public ILoginInfo2 challenge(ITeamRepository repo) {
                    return new UsernameAndPasswordLoginInfo(jazzID,
                            jazzPassword);
                }
            });
            repo.login(new NullProgressMonitor());
        } catch (TeamRepositoryException e) {
            e.printStackTrace();
            return "loginfail";
        }

        wm = SCMPlatform.getWorkspaceManager(repo);
        return "loginsucc";
	}
}



