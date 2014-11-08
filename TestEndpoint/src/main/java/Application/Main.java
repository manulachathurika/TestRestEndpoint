package Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by manula on 11/8/14.
 */
public class Main {
    public static void main(String args[]) {

        String applicationID = "test_app_3";

        String JSON_String = "{  \n" +
                "   \"applications\":[  \n" +
                "      {  \n" +
                "         \"groups\":{  \n" +
                "            \"alias\":\"mygroup3\",\n" +
                "            \"autoScalingPolicy\":\"autoscale_policy_1\",\n" +
                "            \"clusters\":{  \n" +
                "               \"serviceName\":\"tomcat\",\n" +
                "               \"clusterId\":\"mygroup2tomcat.tomcat.domain\",\n" +
                "               \"tenantRange\":\"*\",\n" +
                "               \"hostNames\":[  \n" +
                "                  \"mygroup2tomcat.isuruh.lk\"\n" +
                "               ],\n" +
                "               \"isLbCluster\":false\n" +
                "            },\n" +
                "            \"deploymentPolicy\":\"deployment_policy_1\",\n" +
                "            \"subGroups\":[  \n" +
                "               {  \n" +
                "                  \"alias\":\"mygroup1\",\n" +
                "                  \"autoScalingPolicy\":\"autoscale_policy_group1\",\n" +
                "                  \"clusters\":{  \n" +
                "                     \"serviceName\":\"tomcat\",\n" +
                "                     \"clusterId\":\"mygroup1tomcat.tomcat.domain\",\n" +
                "                     \"member\":[  \n" +
                "                        {  \n" +
                "                           \"serviceName\":\"tomcat\",\n" +
                "                           \"clusterId\":\"mygroup1tomcat.tomcat.domain\",\n" +
                "                           \"networkPartitionId\":\"ec2\",\n" +
                "                           \"partitionId\":\"P1\",\n" +
                "                           \"memberId\":\"mygroup1tomcat.tomcat.domain704c8fc6-a636-4c95-b240-b921d491d721\",\n" +
                "                           \"status\":\"Created\",\n" +
                "                           \"memberIp\":\"10.142.183.156\",\n" +
                "                           \"memberPublicIp\":\"54.179.207.16\",\n" +
                "                           \"property\":[  \n" +
                "                              {  \n" +
                "                                 \"name\":\"PRIMARY\",\n" +
                "                                 \"value\":false\n" +
                "                              },\n" +
                "                              {  \n" +
                "                                 \"name\":\"MIN_COUNT\",\n" +
                "                                 \"value\":1\n" +
                "                              }\n" +
                "                           ]\n" +
                "                        }\n" +
                "                     ],\n" +
                "                     \"tenantRange\":\"*\",\n" +
                "                     \"hostNames\":[  \n" +
                "                        \"mygroup1tomcat.isuruh.lk\"\n" +
                "                     ],\n" +
                "                     \"isLbCluster\":false\n" +
                "                  },\n" +
                "                  \"deploymentPolicy\":\"dep_policy_group1\"\n" +
                "               }\n" +
                "            ]\n" +
                "         },\n" +
                "         \"id\":\"test_app_3\",\n" +
                "         \"tenantAdminUsername\":\"admin\",\n" +
                "         \"tenantDomain\":\"carbon.super\"\n" +
                "      }\n" +
                "   ]\n" +
                "}";

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        ApplicationBean list  = (ApplicationBean)gson.fromJson(JSON_String, ApplicationBean.class);

        if ((list == null) || (list.getApplications() == null)) {
            System.out.println("Application not found: " + applicationID);
            return;
        }

        for (Applications application : list.getApplications()) {
            if (application.getId().equals(applicationID)) {
                System.out.println(getGson().toJson(application));
            }
        }
    }

    public static Gson getGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }
}
