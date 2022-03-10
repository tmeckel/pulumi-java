// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterDatabaseEncryption {
    private final String keyName;
    private final String state;

    @OutputCustomType.Constructor
    private GetClusterDatabaseEncryption(
        @OutputCustomType.Parameter("keyName") String keyName,
        @OutputCustomType.Parameter("state") String state) {
        this.keyName = keyName;
        this.state = state;
    }

    public String getKeyName() {
        return this.keyName;
    }
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterDatabaseEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyName;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterDatabaseEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.state = defaults.state;
        }

        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetClusterDatabaseEncryption build() {
            return new GetClusterDatabaseEncryption(keyName, state);
        }
    }
}
