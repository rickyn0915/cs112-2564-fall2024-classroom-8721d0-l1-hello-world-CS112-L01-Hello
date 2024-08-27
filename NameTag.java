public class NameTag {
    String name = null;

    public NameTag() {
        name = "unknown";
    }

    public NameTag(String newName) {
        name = newName;
    }

public void SetName(String newName)
{
    name = newName;
}

    public NameTag(NameTag nameTag)
    {
        name = nameTag.name;
    }
    public String GetName()
    {
        return name;
    }


    public String toString()
    {
        return name;
    }


    public boolean equals(NameTag nameTag)
    {
        return name.equals(nameTag.name);
    }
}
