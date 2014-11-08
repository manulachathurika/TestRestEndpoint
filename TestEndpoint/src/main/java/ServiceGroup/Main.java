package ServiceGroup;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main (String args[]) {

        String groupDefinitionName = "group3";

        String JSON_String = "{  \n" +
                "   \"serviceGroupDefinition\":{  \n" +
                "      \"cartridges\":[  \n" +
                "         \"tomcat\"\n" +
                "      ],\n" +
                "      \"dependencies\":{  \n" +
                "         \"startupOrders\":[  \n" +
                "            \"group.group1,cartridge.tomcat\"\n" +
                "         ],\n" +
                "         \"terminationBehaviour\":\"terminate-dependents\"\n" +
                "      },\n" +
                "      \"name\":\"group3\",\n" +
                "      \"subGroups\":[  \n" +
                "         \"group1\"\n" +
                "      ]\n" +
                "   }\n" +
                "}";

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        ServiceGroupList list  = (ServiceGroupList)gson.fromJson(JSON_String, ServiceGroupList.class);

        if (list != null) {
            System.out.println(getGson().toJson(list.getServiceGroupDefinition()));
        }

//        if ((list == null) || (list.getServiceGroup() == null) || (list.getServiceGroup().size() == 0)) {
//            System.out.println("Service Group not found: " + groupDefinitionName);
//            return;
//        }
//
//        for (ServiceGroupDefinition definition : list.getServiceGroup()) {
//            if (definition.getName().equals(groupDefinitionName)) {
//                System.out.println(getGson().toJson(definition));
//                return;
//            }
//        }

    }

    public static Gson getGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }
}
