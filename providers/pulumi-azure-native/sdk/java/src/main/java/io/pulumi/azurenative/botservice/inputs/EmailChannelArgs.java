// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.EmailChannelPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Email channel definition
 * 
 */
public final class EmailChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final EmailChannelArgs Empty = new EmailChannelArgs();

    /**
     * The channel name
     * Expected value is 'EmailChannel'.
     * 
     */
    @InputImport(name="channelName", required=true)
      private final Input<String> channelName;

    public Input<String> getChannelName() {
        return this.channelName;
    }

    /**
     * Entity Tag of the resource
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The set of properties specific to email channel resource
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<EmailChannelPropertiesArgs> properties;

    public Input<EmailChannelPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    public EmailChannelArgs(
        Input<String> channelName,
        @Nullable Input<String> etag,
        @Nullable Input<String> location,
        @Nullable Input<EmailChannelPropertiesArgs> properties) {
        this.channelName = Objects.requireNonNull(channelName, "expected parameter 'channelName' to be non-null");
        this.etag = etag;
        this.location = location == null ? Input.ofNullable("global") : location;
        this.properties = properties;
    }

    private EmailChannelArgs() {
        this.channelName = Input.empty();
        this.etag = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> channelName;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> location;
        private @Nullable Input<EmailChannelPropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelName = defaults.channelName;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
        }

        public Builder channelName(Input<String> channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }

        public Builder channelName(String channelName) {
            this.channelName = Input.of(Objects.requireNonNull(channelName));
            return this;
        }

        public Builder etag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder properties(@Nullable Input<EmailChannelPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable EmailChannelPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }
        public EmailChannelArgs build() {
            return new EmailChannelArgs(channelName, etag, location, properties);
        }
    }
}
