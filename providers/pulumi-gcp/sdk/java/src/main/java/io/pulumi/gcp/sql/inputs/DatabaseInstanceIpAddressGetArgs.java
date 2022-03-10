// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceIpAddressGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceIpAddressGetArgs Empty = new DatabaseInstanceIpAddressGetArgs();

    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    @InputImport(name="timeToRetire")
      private final @Nullable Input<String> timeToRetire;

    public Input<String> getTimeToRetire() {
        return this.timeToRetire == null ? Input.empty() : this.timeToRetire;
    }

    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public DatabaseInstanceIpAddressGetArgs(
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> timeToRetire,
        @Nullable Input<String> type) {
        this.ipAddress = ipAddress;
        this.timeToRetire = timeToRetire;
        this.type = type;
    }

    private DatabaseInstanceIpAddressGetArgs() {
        this.ipAddress = Input.empty();
        this.timeToRetire = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceIpAddressGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> timeToRetire;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceIpAddressGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.timeToRetire = defaults.timeToRetire;
    	      this.type = defaults.type;
        }

        public Builder ipAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder timeToRetire(@Nullable Input<String> timeToRetire) {
            this.timeToRetire = timeToRetire;
            return this;
        }

        public Builder timeToRetire(@Nullable String timeToRetire) {
            this.timeToRetire = Input.ofNullable(timeToRetire);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public DatabaseInstanceIpAddressGetArgs build() {
            return new DatabaseInstanceIpAddressGetArgs(ipAddress, timeToRetire, type);
        }
    }
}
