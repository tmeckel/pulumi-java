// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetComponentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetComponentArgs Empty = new GetComponentArgs();

    @InputImport(name="appId", required=true)
      private final String appId;

    public String getAppId() {
        return this.appId;
    }

    @InputImport(name="environmentName", required=true)
      private final String environmentName;

    public String getEnvironmentName() {
        return this.environmentName;
    }

    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    public GetComponentArgs(
        String appId,
        String environmentName,
        String id) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.environmentName = Objects.requireNonNull(environmentName, "expected parameter 'environmentName' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private GetComponentArgs() {
        this.appId = null;
        this.environmentName = null;
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String environmentName;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComponentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.environmentName = defaults.environmentName;
    	      this.id = defaults.id;
        }

        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder environmentName(String environmentName) {
            this.environmentName = Objects.requireNonNull(environmentName);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetComponentArgs build() {
            return new GetComponentArgs(appId, environmentName, id);
        }
    }
}
