// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItem;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfiles {
    private final List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItem> items;

    @OutputCustomType.Constructor
    private FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfiles(@OutputCustomType.Parameter("items") List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItem> items) {
        this.items = items;
    }

    public List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItem> getItems() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfiles defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfiles defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfiles build() {
            return new FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfiles(items);
        }
    }
}
