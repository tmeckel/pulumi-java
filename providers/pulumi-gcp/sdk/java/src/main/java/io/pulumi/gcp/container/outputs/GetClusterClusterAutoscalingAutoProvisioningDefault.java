// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetClusterClusterAutoscalingAutoProvisioningDefault {
    private final String imageType;
    private final String minCpuPlatform;
    private final List<String> oauthScopes;
    private final String serviceAccount;

    @OutputCustomType.Constructor
    private GetClusterClusterAutoscalingAutoProvisioningDefault(
        @OutputCustomType.Parameter("imageType") String imageType,
        @OutputCustomType.Parameter("minCpuPlatform") String minCpuPlatform,
        @OutputCustomType.Parameter("oauthScopes") List<String> oauthScopes,
        @OutputCustomType.Parameter("serviceAccount") String serviceAccount) {
        this.imageType = imageType;
        this.minCpuPlatform = minCpuPlatform;
        this.oauthScopes = oauthScopes;
        this.serviceAccount = serviceAccount;
    }

    public String getImageType() {
        return this.imageType;
    }
    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }
    public List<String> getOauthScopes() {
        return this.oauthScopes;
    }
    public String getServiceAccount() {
        return this.serviceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterAutoscalingAutoProvisioningDefault defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageType;
        private String minCpuPlatform;
        private List<String> oauthScopes;
        private String serviceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterClusterAutoscalingAutoProvisioningDefault defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageType = defaults.imageType;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.serviceAccount = defaults.serviceAccount;
        }

        public Builder imageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }

        public Builder minCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }

        public Builder oauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public GetClusterClusterAutoscalingAutoProvisioningDefault build() {
            return new GetClusterClusterAutoscalingAutoProvisioningDefault(imageType, minCpuPlatform, oauthScopes, serviceAccount);
        }
    }
}
