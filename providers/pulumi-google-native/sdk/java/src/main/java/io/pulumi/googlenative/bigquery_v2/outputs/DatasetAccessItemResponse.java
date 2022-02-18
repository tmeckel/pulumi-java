// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.DatasetAccessEntryResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.RoutineReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TableReferenceResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DatasetAccessItemResponse {
    /**
     * [Pick one] A grant authorizing all resources of a particular type in a particular dataset access to this dataset. Only views are supported for now. The role field is not required when this field is set. If that dataset is deleted and re-created, its access needs to be granted again via an update operation.
     * 
     */
    private final DatasetAccessEntryResponse dataset;
    /**
     * [Pick one] A domain to grant access to. Any users signed in with the domain specified will be granted the specified access. Example: "example.com". Maps to IAM policy member "domain:DOMAIN".
     * 
     */
    private final String domain;
    /**
     * [Pick one] An email address of a Google Group to grant access to. Maps to IAM policy member "group:GROUP".
     * 
     */
    private final String groupByEmail;
    /**
     * [Pick one] Some other type of member that appears in the IAM Policy but isn't a user, group, domain, or special group.
     * 
     */
    private final String iamMember;
    /**
     * [Required] An IAM role ID that should be granted to the user, group, or domain specified in this access entry. The following legacy mappings will be applied: OWNER  roles/bigquery.dataOwner WRITER  roles/bigquery.dataEditor READER  roles/bigquery.dataViewer This field will accept any of the above formats, but will return only the legacy format. For example, if you set this field to "roles/bigquery.dataOwner", it will be returned back as "OWNER".
     * 
     */
    private final String role;
    /**
     * [Pick one] A routine from a different dataset to grant access to. Queries executed against that routine will have read access to views/tables/routines in this dataset. Only UDF is supported for now. The role field is not required when this field is set. If that routine is updated by any user, access to the routine needs to be granted again via an update operation.
     * 
     */
    private final RoutineReferenceResponse routine;
    /**
     * [Pick one] A special group to grant access to. Possible values include: projectOwners: Owners of the enclosing project. projectReaders: Readers of the enclosing project. projectWriters: Writers of the enclosing project. allAuthenticatedUsers: All authenticated BigQuery users. Maps to similarly-named IAM members.
     * 
     */
    private final String specialGroup;
    /**
     * [Pick one] An email address of a user to grant access to. For example: fred@example.com. Maps to IAM policy member "user:EMAIL" or "serviceAccount:EMAIL".
     * 
     */
    private final String userByEmail;
    /**
     * [Pick one] A view from a different dataset to grant access to. Queries executed against that view will have read access to tables in this dataset. The role field is not required when this field is set. If that view is updated by any user, access to the view needs to be granted again via an update operation.
     * 
     */
    private final TableReferenceResponse view;

    @OutputCustomType.Constructor({"dataset","domain","groupByEmail","iamMember","role","routine","specialGroup","userByEmail","view"})
    private DatasetAccessItemResponse(
        DatasetAccessEntryResponse dataset,
        String domain,
        String groupByEmail,
        String iamMember,
        String role,
        RoutineReferenceResponse routine,
        String specialGroup,
        String userByEmail,
        TableReferenceResponse view) {
        this.dataset = Objects.requireNonNull(dataset);
        this.domain = Objects.requireNonNull(domain);
        this.groupByEmail = Objects.requireNonNull(groupByEmail);
        this.iamMember = Objects.requireNonNull(iamMember);
        this.role = Objects.requireNonNull(role);
        this.routine = Objects.requireNonNull(routine);
        this.specialGroup = Objects.requireNonNull(specialGroup);
        this.userByEmail = Objects.requireNonNull(userByEmail);
        this.view = Objects.requireNonNull(view);
    }

    /**
     * [Pick one] A grant authorizing all resources of a particular type in a particular dataset access to this dataset. Only views are supported for now. The role field is not required when this field is set. If that dataset is deleted and re-created, its access needs to be granted again via an update operation.
     * 
     */
    public DatasetAccessEntryResponse getDataset() {
        return this.dataset;
    }
    /**
     * [Pick one] A domain to grant access to. Any users signed in with the domain specified will be granted the specified access. Example: "example.com". Maps to IAM policy member "domain:DOMAIN".
     * 
     */
    public String getDomain() {
        return this.domain;
    }
    /**
     * [Pick one] An email address of a Google Group to grant access to. Maps to IAM policy member "group:GROUP".
     * 
     */
    public String getGroupByEmail() {
        return this.groupByEmail;
    }
    /**
     * [Pick one] Some other type of member that appears in the IAM Policy but isn't a user, group, domain, or special group.
     * 
     */
    public String getIamMember() {
        return this.iamMember;
    }
    /**
     * [Required] An IAM role ID that should be granted to the user, group, or domain specified in this access entry. The following legacy mappings will be applied: OWNER  roles/bigquery.dataOwner WRITER  roles/bigquery.dataEditor READER  roles/bigquery.dataViewer This field will accept any of the above formats, but will return only the legacy format. For example, if you set this field to "roles/bigquery.dataOwner", it will be returned back as "OWNER".
     * 
     */
    public String getRole() {
        return this.role;
    }
    /**
     * [Pick one] A routine from a different dataset to grant access to. Queries executed against that routine will have read access to views/tables/routines in this dataset. Only UDF is supported for now. The role field is not required when this field is set. If that routine is updated by any user, access to the routine needs to be granted again via an update operation.
     * 
     */
    public RoutineReferenceResponse getRoutine() {
        return this.routine;
    }
    /**
     * [Pick one] A special group to grant access to. Possible values include: projectOwners: Owners of the enclosing project. projectReaders: Readers of the enclosing project. projectWriters: Writers of the enclosing project. allAuthenticatedUsers: All authenticated BigQuery users. Maps to similarly-named IAM members.
     * 
     */
    public String getSpecialGroup() {
        return this.specialGroup;
    }
    /**
     * [Pick one] An email address of a user to grant access to. For example: fred@example.com. Maps to IAM policy member "user:EMAIL" or "serviceAccount:EMAIL".
     * 
     */
    public String getUserByEmail() {
        return this.userByEmail;
    }
    /**
     * [Pick one] A view from a different dataset to grant access to. Queries executed against that view will have read access to tables in this dataset. The role field is not required when this field is set. If that view is updated by any user, access to the view needs to be granted again via an update operation.
     * 
     */
    public TableReferenceResponse getView() {
        return this.view;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetAccessItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetAccessEntryResponse dataset;
        private String domain;
        private String groupByEmail;
        private String iamMember;
        private String role;
        private RoutineReferenceResponse routine;
        private String specialGroup;
        private String userByEmail;
        private TableReferenceResponse view;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetAccessItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.domain = defaults.domain;
    	      this.groupByEmail = defaults.groupByEmail;
    	      this.iamMember = defaults.iamMember;
    	      this.role = defaults.role;
    	      this.routine = defaults.routine;
    	      this.specialGroup = defaults.specialGroup;
    	      this.userByEmail = defaults.userByEmail;
    	      this.view = defaults.view;
        }

        public Builder setDataset(DatasetAccessEntryResponse dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }

        public Builder setDomain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setGroupByEmail(String groupByEmail) {
            this.groupByEmail = Objects.requireNonNull(groupByEmail);
            return this;
        }

        public Builder setIamMember(String iamMember) {
            this.iamMember = Objects.requireNonNull(iamMember);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRoutine(RoutineReferenceResponse routine) {
            this.routine = Objects.requireNonNull(routine);
            return this;
        }

        public Builder setSpecialGroup(String specialGroup) {
            this.specialGroup = Objects.requireNonNull(specialGroup);
            return this;
        }

        public Builder setUserByEmail(String userByEmail) {
            this.userByEmail = Objects.requireNonNull(userByEmail);
            return this;
        }

        public Builder setView(TableReferenceResponse view) {
            this.view = Objects.requireNonNull(view);
            return this;
        }

        public DatasetAccessItemResponse build() {
            return new DatasetAccessItemResponse(dataset, domain, groupByEmail, iamMember, role, routine, specialGroup, userByEmail, view);
        }
    }
}
