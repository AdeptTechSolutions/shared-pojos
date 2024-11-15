package org.ascend.shared.pojos.user;

import java.io.Serializable;

public class UserSearchDTO implements Serializable {

    public static final long serialVersionUID = 1L;

     private String search;

     private Integer roleId;

     private Integer offSet;

     private Integer limit;

     private Integer groupId;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getSearch() {
            return search;
        }

        public void setSearch(String search) {
            this.search = search;
        }

        public Integer getRoleId() {
            return roleId;
        }

        public void setRoleId(Integer roleId) {
            this.roleId = roleId;
        }

        public Integer getOffSet() {
            return offSet;
        }

        public void setOffSet(Integer offSet) {
            this.offSet = offSet;
        }

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }

    @Override
    public String toString() {
        return "UserSearchDTO{" +
                "search='" + search + '\'' +
                ", roleId=" + roleId +
                ", offSet=" + offSet +
                ", limit=" + limit +
                '}';
    }
}
