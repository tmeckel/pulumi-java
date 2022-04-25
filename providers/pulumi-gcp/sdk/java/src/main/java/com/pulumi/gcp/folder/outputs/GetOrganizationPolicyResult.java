// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.folder.outputs.GetOrganizationPolicyBooleanPolicy;
import com.pulumi.gcp.folder.outputs.GetOrganizationPolicyListPolicy;
import com.pulumi.gcp.folder.outputs.GetOrganizationPolicyRestorePolicy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOrganizationPolicyResult {
    private final List<GetOrganizationPolicyBooleanPolicy> booleanPolicies;
    private final String constraint;
    private final String etag;
    private final String folder;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<GetOrganizationPolicyListPolicy> listPolicies;
    private final List<GetOrganizationPolicyRestorePolicy> restorePolicies;
    private final String updateTime;
    private final Integer version;

    @CustomType.Constructor
    private GetOrganizationPolicyResult(
        @CustomType.Parameter("booleanPolicies") List<GetOrganizationPolicyBooleanPolicy> booleanPolicies,
        @CustomType.Parameter("constraint") String constraint,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("folder") String folder,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("listPolicies") List<GetOrganizationPolicyListPolicy> listPolicies,
        @CustomType.Parameter("restorePolicies") List<GetOrganizationPolicyRestorePolicy> restorePolicies,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("version") Integer version) {
        this.booleanPolicies = booleanPolicies;
        this.constraint = constraint;
        this.etag = etag;
        this.folder = folder;
        this.id = id;
        this.listPolicies = listPolicies;
        this.restorePolicies = restorePolicies;
        this.updateTime = updateTime;
        this.version = version;
    }

    public List<GetOrganizationPolicyBooleanPolicy> booleanPolicies() {
        return this.booleanPolicies;
    }
    public String constraint() {
        return this.constraint;
    }
    public String etag() {
        return this.etag;
    }
    public String folder() {
        return this.folder;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetOrganizationPolicyListPolicy> listPolicies() {
        return this.listPolicies;
    }
    public List<GetOrganizationPolicyRestorePolicy> restorePolicies() {
        return this.restorePolicies;
    }
    public String updateTime() {
        return this.updateTime;
    }
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetOrganizationPolicyBooleanPolicy> booleanPolicies;
        private String constraint;
        private String etag;
        private String folder;
        private String id;
        private List<GetOrganizationPolicyListPolicy> listPolicies;
        private List<GetOrganizationPolicyRestorePolicy> restorePolicies;
        private String updateTime;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanPolicies = defaults.booleanPolicies;
    	      this.constraint = defaults.constraint;
    	      this.etag = defaults.etag;
    	      this.folder = defaults.folder;
    	      this.id = defaults.id;
    	      this.listPolicies = defaults.listPolicies;
    	      this.restorePolicies = defaults.restorePolicies;
    	      this.updateTime = defaults.updateTime;
    	      this.version = defaults.version;
        }

        public Builder booleanPolicies(List<GetOrganizationPolicyBooleanPolicy> booleanPolicies) {
            this.booleanPolicies = Objects.requireNonNull(booleanPolicies);
            return this;
        }
        public Builder booleanPolicies(GetOrganizationPolicyBooleanPolicy... booleanPolicies) {
            return booleanPolicies(List.of(booleanPolicies));
        }
        public Builder constraint(String constraint) {
            this.constraint = Objects.requireNonNull(constraint);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder folder(String folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder listPolicies(List<GetOrganizationPolicyListPolicy> listPolicies) {
            this.listPolicies = Objects.requireNonNull(listPolicies);
            return this;
        }
        public Builder listPolicies(GetOrganizationPolicyListPolicy... listPolicies) {
            return listPolicies(List.of(listPolicies));
        }
        public Builder restorePolicies(List<GetOrganizationPolicyRestorePolicy> restorePolicies) {
            this.restorePolicies = Objects.requireNonNull(restorePolicies);
            return this;
        }
        public Builder restorePolicies(GetOrganizationPolicyRestorePolicy... restorePolicies) {
            return restorePolicies(List.of(restorePolicies));
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetOrganizationPolicyResult build() {
            return new GetOrganizationPolicyResult(booleanPolicies, constraint, etag, folder, id, listPolicies, restorePolicies, updateTime, version);
        }
    }
}
