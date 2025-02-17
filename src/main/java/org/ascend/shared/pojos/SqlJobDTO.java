package org.ascend.shared.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ascend.shared.pojos.shared.SharedProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SqlJobDTO extends SharedProperties {
    Long userId;
    String projectName;
    Integer projectId;
    String var_url;
    String var_db;
    String var_table_out;
//    String url; // : Path to database containing input DB
//    String db; // : Name of the DB containing the table
//    String tname_in; // : The table to be deidentified
//    String tname_out; // : The name of the new deidentified table
//    String user; // : DB Username of user
//    String password; // : DB Password of user
    String binFunc; // : To be set to 2, for now
    String var_user;
    String var_password;
    String output_db;
    Boolean write_out;
    String host;
    Object var_attr_dict; // tables/attributes to be DE-IDed in output db
    Object unmodifiedDataObj; // tables/attributes to be remained unmodified in output db
    Object mappedFields; // tables/attributes that user mapped for transformation

    String status;
    String detail;
    String outputFilePath; // for db preprocess job
    String databaseType; // for db preprocess job
    Integer port; // for db preprocess job
    String statsPath;
}
