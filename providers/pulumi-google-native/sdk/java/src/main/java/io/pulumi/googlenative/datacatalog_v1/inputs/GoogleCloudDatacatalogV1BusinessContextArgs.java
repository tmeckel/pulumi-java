// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1ContactsArgs;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1EntryOverviewArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Business Context of the entry.
 * 
 */
public final class GoogleCloudDatacatalogV1BusinessContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1BusinessContextArgs Empty = new GoogleCloudDatacatalogV1BusinessContextArgs();

    /**
     * Contact people for the entry.
     * 
     */
    @InputImport(name="contacts")
    private final @Nullable Input<GoogleCloudDatacatalogV1ContactsArgs> contacts;

    public Input<GoogleCloudDatacatalogV1ContactsArgs> getContacts() {
        return this.contacts == null ? Input.empty() : this.contacts;
    }

    /**
     * Entry overview fields for rich text descriptions of entries.
     * 
     */
    @InputImport(name="entryOverview")
    private final @Nullable Input<GoogleCloudDatacatalogV1EntryOverviewArgs> entryOverview;

    public Input<GoogleCloudDatacatalogV1EntryOverviewArgs> getEntryOverview() {
        return this.entryOverview == null ? Input.empty() : this.entryOverview;
    }

    public GoogleCloudDatacatalogV1BusinessContextArgs(
        @Nullable Input<GoogleCloudDatacatalogV1ContactsArgs> contacts,
        @Nullable Input<GoogleCloudDatacatalogV1EntryOverviewArgs> entryOverview) {
        this.contacts = contacts;
        this.entryOverview = entryOverview;
    }

    private GoogleCloudDatacatalogV1BusinessContextArgs() {
        this.contacts = Input.empty();
        this.entryOverview = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1BusinessContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDatacatalogV1ContactsArgs> contacts;
        private @Nullable Input<GoogleCloudDatacatalogV1EntryOverviewArgs> entryOverview;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1BusinessContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contacts = defaults.contacts;
    	      this.entryOverview = defaults.entryOverview;
        }

        public Builder setContacts(@Nullable Input<GoogleCloudDatacatalogV1ContactsArgs> contacts) {
            this.contacts = contacts;
            return this;
        }

        public Builder setContacts(@Nullable GoogleCloudDatacatalogV1ContactsArgs contacts) {
            this.contacts = Input.ofNullable(contacts);
            return this;
        }

        public Builder setEntryOverview(@Nullable Input<GoogleCloudDatacatalogV1EntryOverviewArgs> entryOverview) {
            this.entryOverview = entryOverview;
            return this;
        }

        public Builder setEntryOverview(@Nullable GoogleCloudDatacatalogV1EntryOverviewArgs entryOverview) {
            this.entryOverview = Input.ofNullable(entryOverview);
            return this;
        }

        public GoogleCloudDatacatalogV1BusinessContextArgs build() {
            return new GoogleCloudDatacatalogV1BusinessContextArgs(contacts, entryOverview);
        }
    }
}
