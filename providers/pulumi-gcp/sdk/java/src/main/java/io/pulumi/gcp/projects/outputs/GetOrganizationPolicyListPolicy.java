// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.projects.outputs.GetOrganizationPolicyListPolicyAllow;
import io.pulumi.gcp.projects.outputs.GetOrganizationPolicyListPolicyDeny;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationPolicyListPolicy {
    private final List<GetOrganizationPolicyListPolicyAllow> allows;
    private final List<GetOrganizationPolicyListPolicyDeny> denies;
    private final Boolean inheritFromParent;
    private final String suggestedValue;

    @OutputCustomType.Constructor
    private GetOrganizationPolicyListPolicy(
        @OutputCustomType.Parameter("allows") List<GetOrganizationPolicyListPolicyAllow> allows,
        @OutputCustomType.Parameter("denies") List<GetOrganizationPolicyListPolicyDeny> denies,
        @OutputCustomType.Parameter("inheritFromParent") Boolean inheritFromParent,
        @OutputCustomType.Parameter("suggestedValue") String suggestedValue) {
        this.allows = allows;
        this.denies = denies;
        this.inheritFromParent = inheritFromParent;
        this.suggestedValue = suggestedValue;
    }

    public List<GetOrganizationPolicyListPolicyAllow> getAllows() {
        return this.allows;
    }
    public List<GetOrganizationPolicyListPolicyDeny> getDenies() {
        return this.denies;
    }
    public Boolean getInheritFromParent() {
        return this.inheritFromParent;
    }
    public String getSuggestedValue() {
        return this.suggestedValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyListPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetOrganizationPolicyListPolicyAllow> allows;
        private List<GetOrganizationPolicyListPolicyDeny> denies;
        private Boolean inheritFromParent;
        private String suggestedValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationPolicyListPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allows = defaults.allows;
    	      this.denies = defaults.denies;
    	      this.inheritFromParent = defaults.inheritFromParent;
    	      this.suggestedValue = defaults.suggestedValue;
        }

        public Builder allows(List<GetOrganizationPolicyListPolicyAllow> allows) {
            this.allows = Objects.requireNonNull(allows);
            return this;
        }

        public Builder denies(List<GetOrganizationPolicyListPolicyDeny> denies) {
            this.denies = Objects.requireNonNull(denies);
            return this;
        }

        public Builder inheritFromParent(Boolean inheritFromParent) {
            this.inheritFromParent = Objects.requireNonNull(inheritFromParent);
            return this;
        }

        public Builder suggestedValue(String suggestedValue) {
            this.suggestedValue = Objects.requireNonNull(suggestedValue);
            return this;
        }
        public GetOrganizationPolicyListPolicy build() {
            return new GetOrganizationPolicyListPolicy(allows, denies, inheritFromParent, suggestedValue);
        }
    }
}
